public class Main{
	public static void main(String[] args){
		Passport p1 = new Passport(123456,"Bangladeshi","16/12/2035");
		
		Person per = new Person("Irfan",21,p1);
		
		per.Details();
	}
}