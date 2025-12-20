public class Main{
	public static void main(String[] args){
		Account a1 = new Account(111,30000);
		Account a2 = new Account(222,25000);
		Account a3 = new Account(333,50000);
		Account a4 = new Account(444,40000);
		
		Customer c = new Customer("Mr. Irfan",5);
		
		c.insertACC(a1);
		c.insertACC(a2);
		c.insertACC(a3);
		c.insertACC(a4);
		
		a3.Deposite(50000);
		
		a1.Withdraw(40000);
		
		c.deleteACC(a2);
		
		c.Details();
	}
}