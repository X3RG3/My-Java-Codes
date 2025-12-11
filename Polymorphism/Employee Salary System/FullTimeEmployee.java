public class FullTimeEmployee extends Employee{
	private double monthlyS;
	
	public FullTimeEmployee(){}
	public FullTimeEmployee(double monthlyS){
		this.monthlyS=monthlyS;
	}
	
	public double YearlySalary(double monthlyS){
		return (12*monthlyS);
	}
}