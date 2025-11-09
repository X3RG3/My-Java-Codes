import java.lang.*;
public class PersonMain{
	public static void main(String[] args){
		Person p1=new Person();
		Person p2=new Person();
		Person p3=new Person();
		Person p4=new Person();
		
		p1.setName("Irfan");
		p1.setAge(21);
		p1.setGender("Male");
		p1.setCity("Badda");
		p1.setOccupation("Student");
		
		p2.setName("Mitu");
		p2.setAge(24);
		p2.setGender("Female");
		p2.setCity("Narayanganj");
		p2.setOccupation("Student");
		
		p3.setName("Jalil");
		p3.setAge(30);
		p3.setGender("Male");
		p3.setCity("Rupshi");
		p3.setOccupation("Guard");
		
		p4.setName("Rahim");
		p4.setAge(40);
		p4.setGender("Male");
		p4.setCity("Demra");
		p4.setOccupation("Teacher");
		
		System.out.println(".....Person Information.....");
		System.out.println("Name : "+ p1.getName());
		System.out.println("Age : "+ p1.getAge());
		System.out.println("Gender : "+ p1.getGender());
		System.out.println("Occupation : "+ p1.getOccupation());
		System.out.println("-----------------------------");
		
		System.out.println("Name : "+ p2.getName());
		System.out.println("Age : "+ p2.getAge());
		System.out.println("Gender : "+ p2.getGender());
		System.out.println("Occupation : "+ p2.getOccupation());
		System.out.println("-----------------------------");
		
		System.out.println("Name : "+ p3.getName());
		System.out.println("Age : "+ p3.getAge());
		System.out.println("Gender : "+ p3.getGender());
		System.out.println("Occupation : "+ p3.getOccupation());
		System.out.println("-----------------------------");
		
		System.out.println("Name : "+ p4.getName());
		System.out.println("Age : "+ p4.getAge());
		System.out.println("Gender : "+ p4.getGender());
		System.out.println("Occupation : "+ p4.getOccupation());
		
	}
}