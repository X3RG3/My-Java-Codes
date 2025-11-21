public class Player{
	private String name;
	private int age;
	private String country;
	
	public Player(){
		System.out.println("Empty cons for player");
	}
	public Player(String name,int age,String country){
		this.name=name;
		this.age=age;
		this.country=country;
		System.out.println("Para cons for player");
	}
	
	public void setName(String name){
		this.name=name;
	}
	public void setAge(int age){
		this.age=age;
	}
	public void setCountry(String country){
		this.country=country;
	}
	
	public String getName(){
		return name;
	}
	public int getAge(){
		return age;
	}
	public String getCountry(){
		return country;
	}
	
	public void Details(){
		System.out.println("----------Details----------");
		System.out.println("Name : "+name);
		System.out.println("Age : "+age);
		System.out.println("Country : "+country);
	}
}