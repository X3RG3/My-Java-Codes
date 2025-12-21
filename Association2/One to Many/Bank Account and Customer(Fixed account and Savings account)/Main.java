public class Main{
	public static void main(String[] args){
		Account a1 = new SavingsAccount(111,50000,5.5f);
		Account a2 = new SavingsAccount(222,70000,6.5f);
		
		Account a3 = new FixedAccount(333,60500,2040);
		Account a4 = new FixedAccount(444,75000,2050);
		
		Customer c1 = new Customer("Md. Irfan",5);
		
		c1.Insert(a1);
		c1.Insert(a2);
		c1.Insert(a3);
		c1.Insert(a4);
		
		c1.Delete(a3);
		
		c1.Details();
	}
}