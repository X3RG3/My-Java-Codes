public class Start{
	public static void main(String[] args){
		Shape[] s = new Shape[3];
		
		s[0] = new Circle(4);
		s[1] = new Rectangle(4.5,6.5);
		s[2] = new Triangle(7.2,8.3);
		
		System.out.println("Area of the Circle : "+s[0].Area());
		System.out.println("Area of the Rectangle : "+s[1].Area());
		System.out.println("Area of the Triangle : "+s[2].Area());
	}
}