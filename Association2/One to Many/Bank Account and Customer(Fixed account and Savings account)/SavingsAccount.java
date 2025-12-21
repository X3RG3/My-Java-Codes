public class SavingsAccount extends Account{
	private float interest;
	public SavingsAccount(){}
	public SavingsAccount(int id,double balance,float interest){
		super(id,balance);
		this.interest=interest;
	}
	public void setInterest(float interest){
		this.interest=interest;
	}
	public float getInterest(){
		return interest;
	}
	public void Details(){
		System.out.println("Savings Account ID : "+ getID());
		System.out.println("Savings Account Balance : "+getBalance());
		System.out.println("Interest : "+interest+" %");
	}
}