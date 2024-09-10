package day_3;

public class Student {
    
	String name;
	int grade;
	public Student(String name, int grade) {
		super();
		this.name = name;
		this.grade = grade;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getGrade() {
		return grade;
	}
	public void setGrade(int grade) {
		this.grade = grade;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", grade=" + grade + "]";
	}
	
	public static void main (String arg []) {
		
		Student data = new Student("kk",9);
		System.out.println(data.toString());
	}
}

  
