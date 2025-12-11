public class PartTimeEmployee extends Employee{
	private double hourlyRate;
	private double hoursWorked;
	public PartTimeEmployee(){}
	
	public PartTimeEmployee(double hourlyRate,double hoursWorked){
		this.hourlyRate=hourlyRate;
		this.hoursWorked=hoursWorked;
	}
	
	public double YearlySalary(double hourlyRate,double hoursWorked){
		return (12*30*hourlyRate*hoursWorked);
	}
}