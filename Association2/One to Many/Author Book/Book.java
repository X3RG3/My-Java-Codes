public class Book{
	private String title;
	private double price;
	
	public Book(){}
	public Book(String title,double price){
		this.title=title;
		this.price=price;
	}
	public void BDetails(){
		System.out.println("Book Title : "+title);
		System.out.println("Price : "+price);
	}
}