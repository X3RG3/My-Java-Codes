public class Student{
	private String name;
	private int roll;
	private ID id;
	
	public Student(){}
	
	public Student(String name,int roll,ID id){
		this.name=name;
		this.roll=roll;
		this.id=id;
	}
	
	public void setName(String name){
		this.name=name;
	}
	public String getName(){
		return name;
	}
	
	public void setRoll(int roll){
		this.roll=roll;
	}
	public int getRoll(){
		return roll;
	}
	
	public void setID(ID id){
		this.id=id;
	}
	public ID getID(){
		return id;
	}
	
	public void Details(){
		System.out.println("Name : "+name);
		System.out.println("Roll : "+roll);
		id.Details();
	}
}