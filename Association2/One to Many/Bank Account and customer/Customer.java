public class Customer{
	private String name;
	private Account[] account;
	
	public Customer(){
		System.out.println("Empty Cons for customer ");
	}
	public Customer(String name, int size){
		this.name=name;
		account = new Account[size];
		System.out.println("Para cons for customer");
	}
	public void setName(String name){
		this.name=name;
	}
	public String getName(){
		return name;
	}
	
	public void insertACC(Account acc){
		for(int i=0; i<account.length;i++){
			if(account[i]==null){
				account[i]=acc;
				break;
			}
		}
	}
	
	public void deleteACC(Account acc){
		for(int i=0;i<account.length;i++){
			if(account[i]==acc){
				account[i]=null;
				break;
			}
			else{
				System.out.println("Not Found !!!");
			}
		}
	}
	
	public void Details(){
		System.out.println("Name : "+name);
		
		for(int i=0;i<account.length;i++){
			if(account[i]!=null){
				account[i].Details();
			}
			else{
				System.out.println("Null");
			}
		}
	}
	
	
}