import java.lang.*;

public class Customer
{
	private String name;
	private Account accounts[];
	
	public Customer()
	{
		System.out.println("Empty cons");
	}
	
	public Customer(String name,int size)//size=5
	{
		this.name=name;
		accounts=new Account[size];
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
	
	public void insertAccount(Account acc)//a1
	{
		for(int i=0;i<accounts.length;i++)
		{
			if(accounts[i]==null)
			{
				accounts[i]=acc;
				break;
			}
		}
	}
	
	public void deleteAccount(Account acc)//acc=a2
	{
		for(int i=0;i<accounts.length;i++)
		{
			if(accounts[i]==acc)
			{
				accounts[i]=null;
				break;
			}
			else
			{
				System.out.println("Not found");
			}
		}
	}
	
	
	public void details()
	{
		System.out.println("Name: "+name);
		
		for(int i=0;i<accounts.length;i++)
		{
			if(accounts[i]!=null)
			{
				accounts[i].details();
			}
			else
			{
				System.out.println("Null");
			}
		}
	}
	
	
	
}