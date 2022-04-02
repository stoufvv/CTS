package ro.ase.cts.BiancaPacurar.assignment1;

public class Verify implements VerifyInterface{
	@Override
    public void verifyLoanValue(double loanValue) throws InvalidLoanValueException {
        if(loanValue<=0){
            throw new InvalidLoanValueException();
        }
    }

    @Override
    public void verifyInterestRate(double interestRate) throws InvalidInterestRateException {
        if(interestRate<0){
            throw new InvalidInterestRateException();
        }
    }
}
