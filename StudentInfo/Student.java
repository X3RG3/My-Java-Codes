import java.lang.*;
public class Student{
	private String name;
	private int id;
	private String department;
	private float cgpa;
	private String semester;
	
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
	
	public void setDepartment(String department){
		this.department=department;
	}
	public String getDepartment(){
		return department;
	}
	
	public void setCgpa(float cgpa){
		this.cgpa=cgpa;
	}
	public float getCgpa(){
		return cgpa;
	}
	
	public void setSemester(String semester){
		this.semester=semester;
	}
	public String getSemester(){
		return semester;
	}
}