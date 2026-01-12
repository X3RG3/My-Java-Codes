public class Camera extends Device{
	private String type;
	
	public Camera(){}
	public Camera(int ID,double Price,String type){
		super(ID,Price);
		this.type=type;
	}
	public void setType(String type){
		this.type=type;
	}
	public String getType(){
		return type;
	}
	
	public  void Details(){
		System.out.println("ID: "+getID());
		System.out.println("Price: "+getPrice());
		System.out.println("Type : "+type);
	}
}