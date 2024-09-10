package day_3;

public class Book {
	
	private String title;
	private String author;
	
	public Book() {
		
	}
	
	public Book(String title, String author) {
		
		this.title = title;
		this.author = author;
		
	}

	@Override
	public String toString() {
		return "Book [title=" + title + ", author=" + author + "]";
	}
	
	public static void main (String arg [])
	{
		Book book1 = new Book ("caesar" , "william");
		System.out.println(book1.toString());
	}
	

}
     
