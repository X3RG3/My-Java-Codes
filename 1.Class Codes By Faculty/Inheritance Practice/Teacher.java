import java.lang.*;

public class Teacher extends Person
{
	private double salary;
	
	public Teacher()
	{
		System.out.println("Empty cons for Teacher(Child)");
	}
	
	public Teacher(int id,String name,int age,double salary)
	{
		super(id,name,age);
		this.salary=salary;
		System.out.println("Pera cons for Teacher(Child)");
	}
	
	public void setSalary(double salary)
	{
		this.salary=salary;
	}
	
	public double getSalary()
	{
		return salary;
	}
	
	public void details()
	{
		super.details();
		System.out.println("Salary: "+salary);
	}
	
	
	
} 