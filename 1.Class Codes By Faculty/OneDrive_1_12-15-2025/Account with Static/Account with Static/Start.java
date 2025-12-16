import java.lang.*;

public class Start
{
	
	public static void main(String[] args)
	{
		Account a1=new Account();
		Account a2=new Account(111,26747.34,7.5F);
		a1.details();
		a2.details();
		Account a3=new Account(222,6321.34,9.5F);
		a1.details();
		a2.details();
		a3.details();
		Account a4=new Account();
		a1.details();
		a2.details();
		a3.details();
		a4.details();
	}
	static{
	System.out.println("I am a human");
	}
	
	
	
}