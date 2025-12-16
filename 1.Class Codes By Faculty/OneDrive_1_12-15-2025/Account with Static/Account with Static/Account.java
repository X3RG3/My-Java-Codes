import java.lang.*;

public class Account
{
	private int accno;
	private double balance;
	private static float ir;
	
	public Account()
	{
		System.out.println("Empty Cons");
	}
	
	public Account(int accno,double balance,float ir)
	{
		this.accno=accno;
		this.balance=balance;
		this.ir=ir;
		System.out.println("Pera Cons");
	}
	
	public void setAccno(int accno)
	{
		this.accno=accno;
	}
	
	public int getAccno()
	{
		return accno;
	}
	
	public void setBalance(double balance)
	{
		this.balance=balance;
	}
	
	public double getBalance()
	{
		return balance;
	}
	static{
		System.out.println("I am a Student");
	}
	
	public void setIr(float ir)
	{
		this.ir=ir;
	}
	
	public float getIr()
	{
		return ir;
	}
	
	
	public void details()
	{
		System.out.println("AccNo: "+accno+"\n"+"Balance: "+balance+"\n"+"Ir: "+ir);
	}
	
	static
	{
		System.out.println("I am a programmer");
	}
	
	
}