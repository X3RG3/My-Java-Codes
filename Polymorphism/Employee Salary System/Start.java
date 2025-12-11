public class Start{
	public static void main(String[] args){
		Employee[] e = new Employee[3];
		e[0]= new FullTimeEmployee(50000);
		e[1]= new PartTimeEmployee(200,5);
		e[2]= new Intern(10000);
		
		System.out.println("Full Time Employee Salary : "+ e[0].YearlySalary());
		System.out.println("Part Time Employee Salary : "+ e[1].YearlySalary());
		System.out.println("Intern Employee Salary : "+ e[2].YearlySalary());
		
	}
}