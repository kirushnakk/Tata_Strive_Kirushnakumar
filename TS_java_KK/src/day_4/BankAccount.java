package day_4;

public class BankAccount {
	
	String accountnumber;
	double balance;
	
	
	
	public BankAccount(String accountnumber, double balance) {
		super();
		this.accountnumber = accountnumber;
		this.balance =balance;
		
	}
	public void Deposit(double amount){
		
		
		
		if (amount>0) {
			balance += amount;
			System.out.println("deposited"+ amount+"new bal" +balance);
		} else {
			System.out.println("enter valid amount");
		}
		
		
	}
	public void withdraw(double amount) {
		
		if(amount>0 && amount<=balance) {
			balance -= amount;
			System.out.println("withdraw"+ amount + "new bal" +balance);
			
		}else {
			System.out.println("insuff bal");
		}
		
	}
	
	 public double getBalance() {
	        return balance;
	    }

	    public String getAccountNumber() {
	        return accountnumber;
	    }

}
