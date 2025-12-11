public class Rectangle extends Shape{
	private double length;
	private double width;
	public Rectangle(){}
	public Rectangle(double length,double width){
		this.length=length;
		this.width=width;
	}
	public double Area(){
		return (length*width);
	}
}