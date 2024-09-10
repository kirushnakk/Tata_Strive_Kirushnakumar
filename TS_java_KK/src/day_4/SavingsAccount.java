package day_4;

public class SavingsAccount extends BankAccount {
	
	double interestrate;

	public SavingsAccount(String accountnumber, double balance, double interestrate) {
		super(accountnumber, balance);
		this.interestrate = interestrate;
	}
	
	public void applyInterest() {
        double interest = balance * (interestrate / 100);
        Deposit(interest);
        System.out.println("Interest applied at rate: " + interestrate + "%. Interest amount: $" + interest);
    }

}
