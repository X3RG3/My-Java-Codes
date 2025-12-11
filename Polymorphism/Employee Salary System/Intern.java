public class Intern extends Employee{
	private double stipend;
	public Intern(){}
	public Intern(double stipend){
		this.stipend=stipend;
	}
	public double YearlySalary(double stipend){
		return (12*stipend);
	}
}