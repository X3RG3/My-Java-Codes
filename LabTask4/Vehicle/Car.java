public class Car extends Vehicle{
	private int seats;
	private String fuelType;
	
	public Car(){
		System.out.println("Empty cons for car");
	}
	public Car(String brand,String model,int year, int seats,String fuelType){
		super(brand,model,year);
		this.seats=seats;
		this.fuelType=fuelType;
		System.out.println("Para cons for car");
	}
	
	public void setSeats(int seats){
		this.seats=seats;
	}
	public void setFuelType(String fuelType){
		this.fuelType=fuelType;
	}
	
	public int getSeats(){
		return seats;
	}
	public String getFuelType(){
		return fuelType;
	}
	
	public void Details(){
		super.Details();
		System.out.println("Total Seats : "+seats);
		System.out.println("Fuel Type : "+fuelType);
	}
}