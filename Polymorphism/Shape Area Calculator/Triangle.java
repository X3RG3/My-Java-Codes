public class Triangle extends Shape{
	private double base;
	private double height;
	
	public Triangle (){}
	public Triangle (double base,double height){
		this.base=base;
		this.height=height;
	}
	
	public double Area(){
		return (0.5*base*height);
	}
}