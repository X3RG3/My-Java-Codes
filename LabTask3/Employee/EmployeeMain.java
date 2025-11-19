public class EmployeeMain{
	public static void main(String[] args){
		Employee e1=new Employee("Irfan", 62274, "CEO", 250000,5);
		Employee e2=new Employee();
		Employee e3=new Employee("Ayon", 62273,"MD",230000,4);
		Employee e4=new Employee();
		
		Employee[] e ={e1,e2,e3,e4};
		for(int i=0;i<e.length;i++){
			e[i].Details();
		}
		
	}
}