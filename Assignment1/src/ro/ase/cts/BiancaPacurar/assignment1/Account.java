package ro.ase.cts.BiancaPacurar.assignment1;

public class Account implements MonthlyRateInterface{
	
	private double	loanValue;
	private double interestRate;	
	private int paymentTime;
	
	private Verify verify;
	
	private AccountType accountType;
	
	public static final int DAYS = 365;
	
	
	
	public double getLoanValue() {
		return this.loanValue;
	}
	
	public double getInterestRate() {
		return this.interestRate;
	}
	
	//must have method - the lead has requested it in all classes
	public double getMonthlyRate() {
		return this.loanValue * this.interestRate;
	}
	
	public void setLoanValue(double loanValue) throws InvalidLoanValueException {
		this.verify.verifyLoanValue(loanValue);
        this.loanValue = loanValue;
	}
	
	public void setInterestRate(double interestRate) throws InvalidInterestRateException{
		this.verify.verifyInterestRate(interestRate);
        this.interestRate = interestRate;
	}
	
	@Override
	public String toString() {
		 StringBuilder builder = new StringBuilder();
	        builder.append("Type of loan:");
	        builder.append(this.accountType);
	        builder.append(" value: ");
	        builder.append(  this.loanValue);
	        builder.append(" interest rate: ");
	        builder.append(this.interestRate);
	        builder.append(" and ");
	        builder.append(this.paymentTime);
	        builder.append(" days payment period)");
	        return builder.toString();
	}

	public Account(double loanValue, double interestRate, AccountType accountType,int paymentTime, Verify verify)
            throws InvalidLoanValueException, InvalidInterestRateException {
		this.verify = verify;
		setLoanValue(loanValue);
        setInterestRate(interestRate);
        this.accountType = accountType;
        this.paymentTime = paymentTime; 
    }
	
	 public static double computeBrokerFee(Account[] accounts,double feePercent){
	        double totalFee=0;
	        for (Account account:accounts) {
	            if(account.accountType==AccountType.PREMIUM||account.accountType==AccountType.SUPER_PREMIUM)
	                totalFee+=feePercent*computeInterest(account);	//	1.25%	broker's	fee
	        }
	        return totalFee;
	    }
	    private static double computeInterest(Account account){
	        return account.loanValue * (Math.pow(account.interestRate,getActiveDaysPerYear(account.paymentTime)) -1);

	    }

	    private static double getActiveDaysPerYear(int paymentPeriod ){
	        return (double)paymentPeriod/ DAYS;
	    }
	
}
