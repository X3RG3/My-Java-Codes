import java.lang.*;

public class Account
{
	private int id;
	private double balance;
	
	public Account()
	{
		System.out.println("Empty Cons. Acc.");
	}
	
	public Account(int id, double balance)
	{
		this.id=id;
		this.balance=balance;
		System.out.println("Pera Cons. Acc.");
		
	}
	
	public void setId(int id)
	{
		this.id=id;
	}
	
	public int getId()
	{
		return id;
	}
	
	public void setBalance(double balance)
	{
		this.balance=balance;
	}
	
	public double getBalance()
	{
		return balance;
	}
	
	public void details()
	{
		System.out.println("Id: "+id+"\n"+"Balance: "+balance);
	}
	
	
}