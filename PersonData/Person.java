import java.lang.*;
public class Person{
	private String name;
	private int age;
	private String gender;
	private String city;
	private String occupation;
	
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
}