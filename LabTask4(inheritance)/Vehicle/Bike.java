public class Bike extends Vehicle{
	public int engineCC;
	public boolean hasABS;
	
	public Bike(){
		System.out.println("Empty cons for Bike ");
	}
	public Bike(String brand, String model,int year,int engineCC,boolean hasABS){
		super(brand,model,year);
		this.engineCC=engineCC;
		this.hasABS=hasABS;
		System.out.println("para cons for Bike");
	}
	
	public void setEngineCC(int engineCC){
		this.engineCC=engineCC;
	}
	public void setHasABS(boolean hasABS){
		this.hasABS=hasABS;
	}
	
	public int getEngineCC(){
		return engineCC;
	}
	public boolean getHasABS(){
		return hasABS;
	}
	
	public void Details(){
		super.Details();
		System.out.println("Engine CC : "+engineCC);
		System.out.println("Has ABS : "+hasABS);
	}
}