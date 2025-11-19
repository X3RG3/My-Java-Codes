import java.lang.*;
public class Car{
	private String name;
	private String colour;
	
	public Car(){
		System.out.println("Empty cons for car");
	}
	public Car(String name,String colour){
		this.name=name;
		this.colour=colour;
		System.out.println("Pera cons for car");
	}
	
	public void Display(){
		System.out.println("Your Car model is : "+name+ "\n And it's Colour is : "+ colour);
	}
}