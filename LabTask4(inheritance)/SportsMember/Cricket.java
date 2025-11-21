public class Cricket extends Player{
	private String role;
	private int runs;
	
	public Cricket(){
		System.out.println("Empty cons for cricket ");
	}
	public Cricket(String name, int age, String country,String role, int runs){
		super(name,age,country);
		this.role=role;
		this.runs=runs;
		System.out.println("Para cons for cricket");
	}
	
	public void setRole(String role){
		this.role=role;
	}
	public void setRuns(int runs){
		this.runs=runs;
	}
	public String getRole(){
		return role;
	}
	public int getRuns(){
		return runs;
	}
	
	public void Details(){
		super.Details();
		System.out.println("Role : "+role);
		System.out.println("Runs : "+runs);
	}
}