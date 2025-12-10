public class Student{
	private String name;
	private int id;
	private Book b;
	
	public Student(){}
	public Student(String name,int id,Book b){
		this.name=name;
		this.id=id;
		this.b=b;
	}
	public void setName(String name){
		this.name=name;
	}
	public String getName(){
		return name;
	}
	public void setID(int id){
		this.id=id;
	}
	public int getID(){
		return id;
	}
	
	public void setBook(Book b){
		this.b=b;
	}
	
	public Book getBook(){
		return b;
	}
	
	public void Details(){
		System.out.println("Name : "+name);
		System.out.println("ID : "+id);
		b.Details();
	}
	
}