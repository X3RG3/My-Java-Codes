import java.lang.*;

public class Start 
{
	public static void main(String[] args)
	{
		Person p1=new Person();
		Person p2=new Person(111,"Naruto",24);
		p1.setId(222);
		p1.details();
		p2.details();
		System.out.println("Id"+p2.getId());
		
		
	}
}
