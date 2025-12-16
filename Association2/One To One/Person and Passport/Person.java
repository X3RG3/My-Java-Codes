public class Person{
	private String name;
	private int age;
	private Passport p;
	
	public Person(){}
	
	public Person(String name,int age,Passport p){
		this.name=name;
		this.age=age;
		this.p=p;
	}
	public void setName(String name){
		this.name=name;
	}
	public String getName(){
		return name;
	}
	
	public void setAge(int age){
		this.age=age;
	}
	public int getAge(){
		return age;
	}
	
	public void setPassport(Passport p){
		this.p=p;
	}
	public Passport getPassport(){
		return p;
	}
	
	public void Details(){
		System.out.println("Name : "+name);
		System.out.println("Age : "+age);
		p.Details();
	}
}