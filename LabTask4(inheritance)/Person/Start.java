import java.lang.*;
import java.util.*;
public class Start{
	public static void main(String[] args){
		Coder c1 = new Coder();
		Coder c2 = new Coder();
		
		Businessman b1 = new Businessman();
		Businessman b2 = new Businessman();
		
		Scanner input = new Scanner(System.in);
		System.out.println("Name for coder :");
		c1.setName(input.nextLine());
		System.out.println("Age for Coder : ");
		c1.setAge(input.nextInt());
		input.nextLine();
		System.out.println("City for Coder : ");
		c1.setCity(input.nextLine());
		System.out.println("Language for Coder : ");
		c1.setLang(input.nextLine());
		System.out.println("Experience for Coder : ");
		c1.setExp(input.nextInt());
		input.nextLine();
		
		System.out.println("Name for Businessman :");
		b1.setName(input.nextLine());
		System.out.println("Age for Businessman : ");
		b1.setAge(input.nextInt());
		input.nextLine();
		System.out.println("City for Businessman : ");
		b1.setCity(input.nextLine());
		System.out.println("Company for businessman : ");
		b1.setCompany(input.nextLine());
		System.out.println("Revenue for businessman : ");
		b1.setRevenue(input.nextInt());
		
		c1.Details();
		c2.Details();
		b1.Details();
		b2.Details();
	}
}