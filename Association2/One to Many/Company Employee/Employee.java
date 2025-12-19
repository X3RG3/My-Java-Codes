public class Employee{
	private int EmID;
	private String EmName;
	private double salary;
	public Employee(){}
	
	public Employee(int EmID,String EmName,double salary){
		this.EmID=EmID;
		this.EmName=EmName;
		this.salary=salary;
	}
	
	public void EmDetails(){
		System.out.println("Employee ID : "+EmID);
		System.out.println("Employee Name : "+EmName);
		System.out.println("Salary : "+salary);
	}
}