public class Main{
	public static void main(String[] args){
		Employee[] em = new Employee[3];
		
		em[0]=new Employee(111,"Irfan",25000);
		em[1]=new Employee(222,"Ayon",30000);
		em[2]=new Employee(333,"Iqram",22000);
		
		Company cm = new Company("XYZ",em);
		
		cm.Details();
	}
}