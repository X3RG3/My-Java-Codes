 import java.lang.*;
 public class ViewInfo{
	 public static void main(String[] args){
		 Name n1=new Name();
		 Id id1 = new Id();
		 Department dep1 = new Department();
		 Cgpa cgpa1 = new Cgpa();
		 
		 n1.setName("Irfan");
		 id1.setID(62274);
		 dep1.setDEP("CSE");
		 cgpa1.setCGPA(3.93f);
		 
		 System.out.println("........Student Info........");
		 System.out.println("Name : "+ n1.getName());
		 System.out.println("ID : "+id1.getID());
		 System.out.println("Department : "+ dep1.getDEP());
		 System.out.println("CGPA : "+cgpa1.getCGPA());
		 System.out.println("............................");
	 }
 }