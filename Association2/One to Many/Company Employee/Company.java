public class Company{
	private String Cname;
	Employee[] em;
	
	public  Company(){}
	public  Company(String Cname, Employee[] em){
		this.Cname=Cname;
		this.em=em;
	}
	public void setCname(String Cname){
		this.Cname=Cname;
	}
	public String getCname(){
		return Cname;
	}
	
	public void Details(){
		System.out.println("Company Name : "+Cname);
		System.out.println("Employee : ");
		System.out.println();
		
		for(int i=0;i<em.length;i++){
			em[i].EmDetails();
		}
	}
}