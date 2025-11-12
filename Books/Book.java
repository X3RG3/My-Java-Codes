public class Book{
	private String title;
	private String author;
	private double price;
	
	public Book(){
		System.out.println("Empty const. for Book.")
	}
	
	public Book(String title,String author, double price){
		this.title=title;
		this.author=author;
		this.price=price;
		System.out.println("Para const. for Books. ")
	}
	
	public void display(){
		System.out.println("Title : "+title);
		System.out.println("Author : "+author);
		System.out.println("Price : "+price+ "$");
	}
}