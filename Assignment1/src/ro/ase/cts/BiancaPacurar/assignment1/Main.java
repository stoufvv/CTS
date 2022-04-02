package ro.ase.cts.BiancaPacurar.assignment1;

public class Main {

	public static void main(String[] args) {
		Account[] accounts = new Account[3];
        try {
            accounts[0] = new Account(1029.98, 5, AccountType.SUPER_PREMIUM, 10, new Verify());
            accounts[1] = new Account(6374.076, 3, AccountType.SUPER_PREMIUM, 3400, new Verify());
            accounts[2] = new Account(98374.764, 4, AccountType.PREMIUM, 150, new Verify());
            double totalFee = Account.computeBrokerFee(accounts,0.125);
            System.out.println(totalFee);
        } catch (InvalidLoanValueException e) {
            e.printStackTrace();
        } catch (InvalidInterestRateException e) {
            e.printStackTrace();
        }
	}

}
