package day_2;

public class Student {
	
	private static int id;
	private String name;
	private static String centre;
	private static String country;
	private static int nextid;
	public Student() {
		
		// TODO Auto-generated constructor stub
	}
	
	static {
		int nextid =0;
		centre = "tata";
		country = "india";
	}
	
	public Student(String name) {
		id = ++nextid;
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public int getId() {
		return id;
	}
	
	@Override
	public String toString()
	{
		return "\nid:" + id + "\nname" + name + "\ncentre"+ centre+ "\ncountry" + country;
	}
	

	
	
	

	
}
