public class Employee{
	private String name;
	private int id;
	private String position;
	private int salary;
	private int experience;
	
	public Employee(){
		System.out.println("Empty cons for Employee");
	}
	
	public Employee(String name, int id, String position, int salary, int experience){
		this.name=name;
		this.id=id;
		this.position=position;
		this.salary=salary;
		this.experience= experience;
		System.out.println("Para cons for Employee");
	}
	public void setName(String name){
		this.name=name;
	}
	public String getName(){
		return name;	
	}
	
	public void setId(int id){
		this.id=id;
	}
	public int getId(){
		return id;
	}
	
	public void setPosition(String position){
		this.position=position;
	}
	public String getPosition(){
		return position;
	}
	
	public void setSalary(int salary){
		this.salary=salary;
	}
	public int getSalary(){
		return salary;
	}
	
	public void setExperience(int experience){
		this.experience=experience;
	}
	public int getExperience(){
		return experience;
	}
	public void Details(){
		System.out.println("Name : "+name);
		System.out.println("ID : "+id);
		System.out.println("Position : "+position);
		System.out.println("Salary : "+salary);
		System.out.println("Experience : "+experience);
		System.out.println();
	}
}