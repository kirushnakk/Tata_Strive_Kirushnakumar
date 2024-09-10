package day_8;
import java.util.Comparator;

public class Product {
	
	int productid;
	String productName;
	double price;
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Product(int productid, String productName, double price) {
		super();
		this.productid = productid;
		this.productName = productName;
		this.price = price;
	}
	
	public String toString(){
		
		return productid + " " + productName + " " + price;
		
		
	}
	
	public class SortById implements Comparator <Product>
	{
		public int compare (Product a , Product b) {
		return a.productid - b.productid ;
		
		}
	}
    
	public class SortByPrice implements Comparator<Product>
	{
		public int compare (Product a , Product b) {
			return Double.compare(a.price,b.price);
		}
	}

}
