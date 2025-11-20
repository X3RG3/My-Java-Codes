public class Vehicle{
	private String brand;
	private String model;
	private int year;
	
	public Vehicle(){
		System.out.println("Empty cons for vehicle");
	}
	public Vehicle(String brand,String model,int year){
		this.brand=brand;
		this.model=model;
		this.year=year;
		System.out.println("Para cons for vahicle");
	}
	
	public void setBrand(String brand){
		this.brand=brand;
	}
	public void setModel(String model){
		this.model= model;
	}
	public void setYear(int year){
		this.year= year;
	}
	
	public String getBrand(){
		return brand;
	}
	public String getModel(){
		return model;
	}
	public int getYear(){
		return year;
	}
	
	public void Details(){
		System.out.println("Brand : "+brand);
		System.out.println("Model : "+model);
		System.out.println("Year : "+year);
	}
}