public class Book{
	private String title;
	private String author;
	private double price;
	
	public Book(){}
	
	public Book(String t,String a, double p){
		this.title=t;
		this.author=a;
		this.price=p;
	}
	
	public void display(){
		System.out.println("Title : "+title);
		System.out.println("Author : "+author);
		System.out.println("Price : "+price+ "$");
	}
}