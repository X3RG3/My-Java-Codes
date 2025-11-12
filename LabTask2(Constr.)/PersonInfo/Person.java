import java.lang.*;
public class Person{
	private String name;
	private int age;
	private String gender;
	private String city;
	private String occupation;
	
	public Person(){
		System.out.println("Empty cons. for Person");
	}
	
	public Person(String name,int age,String gender,String city,String occupation){
		this.name=name;
		this.age=age;
		this.gender=gender;
		this.city=city;
		this.occupation=occupation;
		System.out.println("Para. cons. for Person");
	}
	
	public void Details(){
		System.out.println("Name : "+name);
		System.out.println("Age : "+age);
		System.out.println("Gender : "+gender);
		System.out.println("City : "+city);
		System.out.println("Occupation : "+occupation);
		System.out.println("---------------------------");
	}
	
}