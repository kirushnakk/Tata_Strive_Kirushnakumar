package day_4;

public class Developer extends Employee{
	
	String programmingLanguage;
	
public Developer(String name, int id, double salary, String programmingLanguage) {
	        super(name, id, salary);  
	        this.programmingLanguage = programmingLanguage;
	    }

@Override
public void Display() {
    super.Display();  
    System.out.println("Programming Language: " + programmingLanguage);
}
}