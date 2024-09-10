package day_4;

public class Test1 {
	
	public static void main (String args[]) {
		
		SavingsAccount savings = new SavingsAccount("SA12345", 1000.0, 5.0);
        savings.Deposit(500.0);
        savings.withdraw(200.0);
        savings.applyInterest();
        System.out.println("Final Savings Account Balance: $" + savings.getBalance());

        
        CurrentAccount current = new CurrentAccount("CA67890", 500.0, 200.0);
        current.Deposit(300.0);
        current.withdraw(700.0); 
        current.withdraw(100.0); 
        System.out.println("Final Current Account Balance: $" + current.getBalance());
    }
	}


