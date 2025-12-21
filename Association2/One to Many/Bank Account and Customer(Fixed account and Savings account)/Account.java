public abstract class Account{
	private int id;
	private double balance;
	public Account (){}
	public Account(int id,double balance){
		this.id=id;
		this.balance=balance;
	}
	public void setID(int id){
		this.id=id;
	}
	public int getID(){
		return id;
	}
	public void setBalance(double balance){
		this.balance=balance;
	}
	public double getBalance(){
		return balance;
	}
	
	public abstract void Details();
}