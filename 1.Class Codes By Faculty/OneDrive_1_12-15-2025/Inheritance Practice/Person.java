import java.lang.*;

public class Person
{
	private int id;
	private String name;
	private int age;
	
	public Person()
	{
		System.out.println("Empty cons for Person(parent)");
	}
	public Person(int id,String name,int age)
	{
		this.id=id;
		this.name=name;
		this.age=age;
		System.out.println("Pera cons for Person(parent)");
	}
	
	public void setId(int id)
	{
		this.id=id;
	}
	public int getId()
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
	
	public void setAge(int age) 
	{
		this.age=age;
	}
	
	public int getAge()
	{
		return age;
	}
	
	public void details()
	{
		System.out.println("ID: "+id+"\n"+"Name: "+name+"\n"+"Age: "+age);
	}
	
}