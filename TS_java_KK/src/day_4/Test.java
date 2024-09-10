package day_4;

public class Test{
public static void main(String[] args) {
	// TODO Auto-generated method stub

	 Manager manager = new Manager("kk", 1, 7000, "accounts");
        
        
     Developer developer = new Developer("mk", 2, 8000, "Java");

       
     System.out.println("Manager Information:");
        manager.Display();

     System.out.println();

        
     System.out.println("Developer Information:");
        developer.Display();
	
}

}
