import java.lang.*;

public class Start 
{
	public static void main(String[] args)
	{
		Person p1=new Person();
		Person p2=new Person();
		
		System.out.println("Id: "+p1.getId());
		p1.setId(111);
		System.out.println("Id: "+p2.getId());
		p1.setId(333);
		System.out.println("Id: "+p1.getId());
		p1.setName("Naruto");
		p1.setAge(24);
		System.out.println("Name: "+p1.getName());
		System.out.println("Age: "+p1.getAge());
		
	}
}
