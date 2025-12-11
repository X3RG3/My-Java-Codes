public class Circle extends Shape{
	private double radius;
	public Circle(){}
	public Circle(double radius){
		this.radius = radius;
	}
	
	public double Area(){
		return (radius * 3.1416);
	}
}