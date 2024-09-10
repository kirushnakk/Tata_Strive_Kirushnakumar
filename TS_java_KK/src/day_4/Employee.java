package day_4;

public class Employee {
	
	String name;
	int id;
	double salary;
	
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Employee(String name, int id, double salary) {
		super();
		this.name = name;
		this.id = id;
		this.salary = salary;
	}
	
	public void Display(){
		
		System.out.println("name:" + name);
		System.out.println("id:" + id);
		System.out.println("salary:" + salary);
		
	}	
	
	
}
	
