import java.lang.*;
public class Person{
	private int id;
	private String name;
	private float cgpa;
	public void setID(int id)
	{
		this.id=id;
	}
	public int getID()
	{
		return id;
	}
	public void setName(String name)
	{
		this.name=name;
	}
	public String getName()
	{
		return name;
	}
	public void setCgpa(float cgpa)
	{
		this.cgpa = cgpa;
	}
	public float getCgpa()
	{
		return cgpa;
	}
	public static void main(String[] args)
	{
		Person p1 = new Person();
		p1.setID(6274);
		System.out.println("ID : "+p1.getID());
		p1.setName("Ayon");
		System.out.println("Name : "+p1.getName());
		p1.setCgpa(3.93f);
		System.out.println("CGPA : "+p1.getCgpa());
	}
}