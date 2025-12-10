public class Book{
	private String title;
	private String author;
	
	public Book(){}
	public Book(String title, String author){
		this.title=title;
		this.author=author;
	}
	
	public void setTitle(String title){
		this.title=title;
	}
	public String getTitle(){
		return title;
	}
	
	public void setAuthor(String title){
		this.author=author;
	}
	public String getAuthor(){
		return author;
	}
	
	public void Details(){
		System.out.println("Title : "+title);
		System.out.println("Author : "+author);
	}
}