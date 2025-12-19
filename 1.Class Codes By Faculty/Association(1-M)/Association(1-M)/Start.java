import java.lang.*;

public class Start
{
	public static void main(String[] args)
	{
		Account a1=new Account(111,451164);
		Account a2=new Account(222,123);
		Account a3=new Account(333,8713);
		Account a4=new Account(444,5234);
		
		Customer c1=new Customer("Mr. X",5);
		
		a1.withdraw(200000);
		
		c1.insertAccount(a1);
		c1.insertAccount(a2);
		c1.insertAccount(a3);
		c1.insertAccount(a4);
		
		c1.deleteAccount(a2);
		
		
		
		
		c1.details();

		
	}
}