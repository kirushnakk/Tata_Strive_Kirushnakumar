package day_3;

public class Rectangle {
	
	double length;
	double width;
	double area;
	
	public Rectangle() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Rectangle(double length, double width) {
		super();
		this.length = length;
		this.width = width;
	}
	
	
    public Rectangle(double length) {
		super();
		this.length = length;
	}
    
    @Override
	public String toString() {
    	
		return "Rectangle [area=" + length*width + "]";
	}

	public static void main(String[] args) {
		
		Rectangle area = new Rectangle (4,6);
		System.out.println(area.toString());
		
		}

}
