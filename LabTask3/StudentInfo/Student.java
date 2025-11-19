import java.lang.*;
public class Student{
	private String name;
	private int id;
	private String department;
	private float cgpa;
	private String semester;
	
	public Student(){
		System.out.println("Empty cons. for Student");
	}
	
	public Student(String name, int id,String department,float cgpa, String semester){
		this.name=name;
		this.id=id;
		this.department=department;
		this.cgpa=cgpa;
		this.semester=semester;
		System.out.println("Para cons for Student"); 
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
	public void Details(){
		System.out.println("Name : "+name);
		System.out.println("Id : "+id);
		System.out.println("Department : "+department);
		System.out.println("CGPA : "+cgpa);
		System.out.println("Semester : "+semester);
		System.out.println();
	}
	
}