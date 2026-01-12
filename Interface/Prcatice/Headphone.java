public class Headphone extends Device{
	private String Ctype;
	public Headphone(){}
	public Headphone(int ID,double Price,String Ctype){
		super(ID,Price);
		this.Ctype=Ctype;
	}
	
	public void setCType(String Ctype){
		this.Ctype=Ctype;
	}
	public String getCType(){
		return Ctype;
	}
	
	public void Details(){
		System.out.println("ID: "+getID());
		System.out.println("Price: "+getPrice());
		System.out.println("Connection Type: "+Ctype);
	}
}