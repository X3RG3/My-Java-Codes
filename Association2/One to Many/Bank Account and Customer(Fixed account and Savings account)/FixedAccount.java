public class FixedAccount extends Account{
	private int year;
	public FixedAccount(){}
	public FixedAccount(int id,double balance, int year){
		super(id,balance);
		this.year=year;
	}
	
	public void setYear(int year){
		this.year=year;
	}
	public int getYear(){
		return year;
	}
	public void Details(){
		System.out.println("Fixed Account ID : "+ getID());
		System.out.println("Fixed Account Balance : "+getBalance());
		System.out.println("Year : "+year);
	}
}