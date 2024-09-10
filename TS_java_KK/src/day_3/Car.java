package day_3;

public class Car {
	
	String make;
	String model;
	int year;
	
	public Car(String make, String model, int year) {
		super();
		this.make = make;
		this.model = model;
		this.year = year;
	}

	
	@Override
	public String toString() {
		return "Car [make=" + make + ", model=" + model + ", year=" + year + "]";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Car c1 = new Car("BMW","xyz",2024);
		String s = c1.toString();
		
		System.out.println(s);
		

	}

}
