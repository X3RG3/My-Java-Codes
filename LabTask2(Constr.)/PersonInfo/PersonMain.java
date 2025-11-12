import java.lang.*;
public class PersonMain{
	public static void main(String[] args){
		Person p1=new Person("Ayon",21,"Male", "Dhaka", "Student");
		Person p2=new Person();
		Person p3=new Person("Rahim", 40, "Female", "Dhaka", "Teacher");
		Person p4=new Person();
		
		p1.Details();
		p2.Details();
		p3.Details();
		p4.Details();
	}
}