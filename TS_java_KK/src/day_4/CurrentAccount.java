package day_4;

public class CurrentAccount extends BankAccount {
	
	double overdraftlimit;

	public CurrentAccount(String accountnumber, double balance, double overdraftlimit) {
		super(accountnumber, balance);
		this.overdraftlimit = overdraftlimit;
	}
	
	@Override
	 public void withdraw(double amount) {
        if (amount > 0 && amount <= (balance + overdraftlimit)) {
            balance -= amount;
            System.out.println("Withdrew $" + amount + ". New balance: $" + balance);
        } else {
            System.out.println("Withdrawal amount exceeds the overdraft limit or is invalid.");
        }
    }


	
	

}
