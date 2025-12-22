public class Patient{
	private String name;
	private String address;
	
	public Patient(){}
	public Patient(String name,String address){
		this.name=name;
		this.address=address;
	}
	
	public void setName(String name){
		this.name=name;
	}
	public String getName(){
		return name;
	}
	
	public void setAddress(String address){
		this.address=address;
	}
	public String getAddress(){
		return address;
	}
	
	public void Details(){
		System.out.println("Patient Name : "+name);
		System.out.println("Patient address : "+address);
	}
}