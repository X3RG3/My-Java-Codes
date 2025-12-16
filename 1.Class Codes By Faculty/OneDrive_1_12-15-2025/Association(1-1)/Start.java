import java.lang.*;

public class Start
{
	public static void main(String[] args)
	{
		Account a1=new Account(111,98349.24);
		Customer c1=new Customer("Mr. X",a1);
		c1.details();
		
		Account a2=new Account(222,123.34);
		Account a3=new Account(333,45768);
		Customer c2=new Customer("Mr.Y",a2);
		c2.details();

		
	}
}