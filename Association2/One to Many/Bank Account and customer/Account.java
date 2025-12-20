public class Account{
	private int id;
	private double balance;
	
	public Account(){
		System.out.println("Empty cons for Account");
	}
	public Account (int id,double balance){
		this.id=id;
		this.balance=balance;
	}
	
	public void setId(int id){
		this.id=id;
	}
	public int getId(){
		return id;
	}
	public void setBalance(double balance){
		this.balance=balance;
	}
	public double getBalance(){
		return balance;
	}
	public void Deposite(double amnt){
		if(amnt>0){
			balance+=amnt;
		}
		else{
			System.out.println("Error Amount!!");
		}
	}
	public void Withdraw(double amnt){
		if(amnt>0 && amnt<=balance){
			balance-=amnt;
		}
		else{
			System.out.println("Bhai dekhi amar motoi gorib XD")
		}
	}
	
	public void Details(){
		System.out.println("ID : "+id);
		System.out.println("Balance : "+balance);
	}
}