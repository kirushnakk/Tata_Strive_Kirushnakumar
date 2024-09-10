package day_4;

 public class Manager extends Employee{
		
		String department;
	
	
	public Manager(String name, int id, double salary, String department) {
        super(name, id, salary);  
        this.department = department;
    }
	
	 @Override
	    public void Display() {
	        super.Display();  
	        System.out.println("Department: " + department);
	    }
	

}
