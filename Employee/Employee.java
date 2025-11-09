public class Employee{
	private String name;
	private int id;
	private String position;
	private int salary;
	private int experience;
	
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
}