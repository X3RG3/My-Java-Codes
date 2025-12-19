import java.lang.*;

public class Customer
{
	private String name;
	private Account acc;
	
	public Customer()
	{
		System.out.println("Empty cons");
	}
	
	public Customer(String name,Account acc)
	{
		this.name=name;
		this.acc=acc;
		System.out.println("Pera cons");
	}
	
	public void setName(String name)
	{
		this.name=name;
	}
	
	public String getName()
	{
		return name;
	}
	
	public void setAcc(Account acc)
	{
		this.acc=acc;
	}
	
	public Account getAcc()
	{
		return acc;
	}
	
	public void details()
	{
		System.out.println("Name: "+name);
		acc.details();
	}
	
	
	
}