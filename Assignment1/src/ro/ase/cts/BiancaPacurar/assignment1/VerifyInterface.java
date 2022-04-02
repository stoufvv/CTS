package ro.ase.cts.BiancaPacurar.assignment1;

public interface VerifyInterface {
	void verifyLoanValue(double loanValue) throws InvalidLoanValueException;
    void verifyInterestRate(double interestRate) throws InvalidInterestRateException;
}
