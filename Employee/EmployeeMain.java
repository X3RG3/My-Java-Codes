public class EmployeeMain{
	public static void main(String[] args){
		Employee e1=new Employee();
		Employee e2=new Employee();
		Employee e3=new Employee();
		Employee e4=new Employee();
		
		e1.setName("Irfan");
		e1.setId(62273);
		e1.setPosition("CEO");
		e1.setSalary(250000);
		e1.setExperience(5);
		
		e2.setName("Ayon");
		e2.setId(62274);
		e2.setPosition("MD");
		e2.setSalary(230000);
		e2.setExperience(4);
		
		e3.setName("Rahmat");
		e3.setId(62275);
		e3.setPosition("COO");
		e3.setSalary(200000);
		e3.setExperience(3);
		
		e4.setName("Kader");
		e4.setId(62276);
		e4.setPosition("CFO");
		e4.setSalary(200000);
		e4.setExperience(3);
		
		System.out.println("-----Employee Information-----");
		System.out.println("Name : "+e1.getName());
		System.out.println("ID : "+e1.getId());
		System.out.println("Position : "+e1.getPosition());
		System.out.println("Salary : "+e1.getSalary());
		System.out.println("--------------------------------");
		
		System.out.println("Name : "+e2.getName());
		System.out.println("ID : "+e2.getId());
		System.out.println("Position : "+e2.getPosition());
		System.out.println("Salary : "+e2.getSalary());
		System.out.println("--------------------------------");
		
		System.out.println("Name : "+e3.getName());
		System.out.println("ID : "+e3.getId());
		System.out.println("Position : "+e3.getPosition());
		System.out.println("Salary : "+e3.getSalary());
		System.out.println("--------------------------------");
		
		System.out.println("Name : "+e4.getName());
		System.out.println("ID : "+e4.getId());
		System.out.println("Position : "+e4.getPosition());
		System.out.println("Salary : "+e4.getSalary());
		
	}
}