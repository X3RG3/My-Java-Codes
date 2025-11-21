import java.lang.*;
import java.util.*;
public class  Main{
	public static void main(String[] args){
		Car c1 = new Car();
		Car c2 = new Car();
		
		Bike b1 = new Bike();
		Bike b2 = new Bike();
		
		Scanner input  = new  Scanner(System.in);
		System.out.println("Brand for Car : ");
		c1.setBrand(input.nextLine());
		System.out.println("Model for Car : ");
		c1.setModel(input.nextLine());
		System.out.println("Year for the Car : ");
		c1.setYear(input.nextInt());
		input.nextLine();
		System.out.println("Seats of this Model : ");
		c1.setSeats(input.nextInt());
		input.nextLine();
		System.out.println("Fuel type : ");
		c1.setFuelType(input.nextLine());
		
		System.out.println("Brand for Bike : ");
		b1.setBrand(input.nextLine());
		System.out.println("Model for Bike : ");
		b1.setModel(input.nextLine());
		System.out.println("Year for the Bike : ");
		b1.setYear(input.nextInt());
		input.nextLine();
		System.out.println("Engine CC for Bike : ");
		b1.setEngineCC(input.nextInt());
		input.nextLine();
		System.out.println("Has ABS ? :");
		b1.setHasABS(input.nextBoolean());
		
		c1.Details();
		c2.Details();
		b1.Details();
		b2.Details();
		
	}
}