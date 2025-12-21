public class Customer{
	private String name;
	private Account account[];
	public Customer(){}
	public Customer(String name, int size){
		this.name=name;
		account = new Account[size];
	}
	public void setName(String name){
		this.name=name;
	}
	public String getName(){
		return name;
	}
	public void Insert(Account acc){
		for(int i=0;i<account.length;i++){
			if(account[i]==null){
				account[i]=acc;
				break;
			}
		}
	}
	
	public void Delete(Account acc){
		for(int i=0;i<account.length;i++){
			if(account[i]==acc){
				account[i]=null;
				break;
			}
			else{
				System.out.println("Account not found !! ");
			}
		}
	}
	
	public void Details(){
		System.out.println("Customer Name : "+ name);
		for(int i=0;i<account.length;i++){
			if(account[i]!=null){
				account[i].Details();
			}
			else{
				System.out.println("NULL ACCOUNT");
			}
		}
	}
}