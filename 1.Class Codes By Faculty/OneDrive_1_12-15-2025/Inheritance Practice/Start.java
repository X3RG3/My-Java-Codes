import java.lang.*;

public class Start
{
	public static void main(String[] args)
	{
		Person p1=new Person(111,"Mr. X",26);
		p1.details();
		
		Student s1=new Student(222,"Naruto",25,3.95F);
		s1.details();
		
		Student s2=new Student();
		s2.details();
		
		Teacher t1=new Teacher(101,"Mr. xyz",42,31409);
		t1.details();
		t1.setId(202);
		t1.details();
		
	}
}