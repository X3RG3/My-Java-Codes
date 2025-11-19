import java.lang.*;
public class PersonMain{
	public static void main(String[] args){
		Person p1=new Person("Ayon",21,"Male", "Dhaka", "Student");
		Person p2=new Person();
		Person p3=new Person("Rahim", 40, "Female", "Dhaka", "Teacher");
		Person p4=new Person();
		
		Person[] p={p1,p2,p3,p3};
		for(int i=0;i<p.length;i++){
			p[i].Details();
		}
	}
}