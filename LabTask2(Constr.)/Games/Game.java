public class Game{
	private String name;
	private String company;
	private float price;
	private float rating;
	private float size;
	
	public Game(){
		System.out.println("Empty cons for Game");
	}
	
	public Game(String name,String company, float price , float rating, float size){
		this.name=name;
		this.company= company;
		this.price = price;
		this.rating=rating;
		this.size=size;
		System.out.println("Para cons for Game ");
	}
	
	public void Details(){
		System.out.println("Game Name : "+ name);
		System.out.println("Company : "+company);
		System.out.println("Price : "+price+"$");
		System.out.println("Rating : "+rating+ "*");
		System.out.println("Game Size : "+size+"GB");
		System.out.println();
	}
}