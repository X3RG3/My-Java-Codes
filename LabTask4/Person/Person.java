import java.lang.*;
public class Person{
	private String name;
	private int age;
	private String city;
	
	public Person(){
		System.out.println("Empty cons for person.");
	}
	public Person(String name,int age,String city){
		this.name=name;
		this.age=age;
		this.city=city;
		System.out.println("Pera cons for person.");
	}
	public void setName(String name){
		this.name=name;
	}
	public String getName(){
		return name;
	}
	public void setAge(int age){
		this.age=age;
	}
	public  int getAge(){
		return age;
	}
	public void setCity(String city){
		this.city=city;
	}
	public String getCIty(){
		return city;
	}
	
	public void Details(){
		System.out.println("Name : "+name);
		System.out.println("Age : "+age);
		System.out.println("City : "+city);
	}
}