public abstract class Device{
	private int ID;
	private double Price;
	public Device(){}
	
	public Device(int ID,double Price){
		this.ID=ID;
		this.Price=Price;
	}
	public void setId(int ID){
		this.ID=ID;
	}
	public int getID(){
		return ID;
	}
	public void setPrice(double Price){
		this.Price=Price;
	}
	public double getPrice(){
		return Price;
	}
	
	public abstract void Details();
}