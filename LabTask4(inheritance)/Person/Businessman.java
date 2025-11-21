import java.lang.*;
public class Businessman extends Person{
	private String company;
	private int revenue;
	
	public Businessman(){
		System.out.println("Empty cons for  Businessman");
	}
	public Businessman(String name,int age,String city,String company,int revenue){
		super(name,age,city);
		this.company=company;
		this.revenue=revenue;
		System.out.println("Pera cons for Businessman");
	}
	
	public void setCompany(String  company){
		this.company=company;
	}
	public  String getCompany(){
		return company;
	}
	
	public void setRevenue(int revenue){
		this.revenue=revenue;
	}
	public int getRevenue(){
		return revenue;
	}
	
	public void Details(){
		super.Details();
		System.out.println("Company : "+company);
		System.out.println("Revenue : "+revenue);
	}
	
}