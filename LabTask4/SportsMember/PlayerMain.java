import java.lang.*;
import java.util.*;
public class PlayerMain{
	public static void main(String[] args){
		
		Cricket c1 = new Cricket();
		Cricket c2 = new Cricket();
		
		Football f1= new Football();
		Football f2= new Football();
		Scanner input =new Scanner(System.in);
		
		System.out.println("Enter name for Cricketer 1: ");
		c1.setName(input.nextLine());
		System.out.println("Enter age for Cricketer 1: ");
		c1.setAge(input.nextInt());
		input.nextLine();
		System.out.println("Enter country for Cricketer 1: ");
		c1.setCountry(input.nextLine());
		System.out.println("Enter Role for Cricketer 1 : ");
		c1.setRole(input.nextLine());
		System.out.println("Enter Runs for Cricketer 1 : ");
		c1.setRuns(input.nextInt());
		input.nextLine();
		
		System.out.println("Enter name for Footballer 1: ");
		f1.setName(input.nextLine());
		System.out.println("Enter age for Footballer 1: ");
		f1.setAge(input.nextInt());
		input.nextLine();
		System.out.println("Enter country for Footballer 1: ");
		f1.setCountry(input.nextLine());
		System.out.println("Enter Position for Footballer 1 : ");
		f1.setPosition(input.nextLine());
		System.out.println("Enter goals for Footballer 1 : ");
		f1.setGoals(input.nextInt());
		input.nextLine();
		
		c1.Details();
		c2.Details();
		f1.Details();
		f2.Details();
		
	}
}