import java.lang.*;

public class Student extends Person
{
	private float cgpa;
	
	public Student()
	{
		System.out.println("Empty cons for Student(child)");
	}
	
	public Student(int id,String name,int age,float cgpa)
	{
		super(id,name,age);
		this.cgpa=cgpa;
		System.out.println("Pera cons for Student(child)");
	}
	
	public void setCgpa(float cgpa)
	{
		this.cgpa=cgpa;
	}
	
	public float getCgpa()
	{
		return cgpa;
	}
	
	public void details()
	{
		super.details();
		System.out.println("Cgpa: "+cgpa);
		
		/*System.out.println("Id: "+getId()+"\n"+"name: "+getName()+"\n"+"Age: "+getAge()+"\n"+"cgpa: "+cgpa);*/
	}
	
	
	
}