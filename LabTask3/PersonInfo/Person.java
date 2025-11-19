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
	public void setName(String name){
		this.name=name;
	}
	public String getName(){
		return name;
	}
	
	public void setAge(int age){
		this.age=age;
	}
	public int getAge(){
		return age;
	}
	
	public void setGender(String gender){
		this.gender=gender;
	}
	public String getGender(){
		return gender;
	}
	
	public void setCity(String city){
		this.city=city;
	}
	public String getCity(){
		return city;
	}
	
	public void setOccupation(String occupation){
		this.occupation=occupation;
	}
	public String getOccupation(){
		return occupation;
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