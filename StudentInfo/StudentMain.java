public class StudentMain{
	public static void main(String[] args){
		Student s1=new Student();
		Student s2=new Student();
		Student s3=new Student();
		Student s4=new Student();
		
		s1.setName("Irfan");
		s1.setId(62274);
		s1.setDepartment("CSE");
		s1.setCgpa(3.93f);
		s1.setSemester("2nd");
		
		s2.setName("Ayon");
		s2.setId(62272);
		s2.setDepartment("CSE");
		s2.setCgpa(3.91f);
		s2.setSemester("2nd");
		
		s3.setName("Mohammad");
		s3.setId(62275);
		s3.setDepartment("CSE");
		s3.setCgpa(3.92f);
		s3.setSemester("3rd");
		
		s4.setName("Rahim");
		s4.setId(62375);
		s4.setDepartment("BBA");
		s4.setCgpa(3.93f);
		s4.setSemester("1st");
		
		System.out.println("-----Student Information-----");
		System.out.println("Name : "+s1.getName());
		System.out.println("ID : "+s1.getId());
		System.out.println("Department : "+s1.getDepartment());
		System.out.println("CGPA : "+s1.getCgpa());
		System.out.println("Semester : "+s1.getSemester());
		
		System.out.println("-------------------------------");
		System.out.println("Name : "+s2.getName());
		System.out.println("ID : "+s2.getId());
		System.out.println("Department : "+s2.getDepartment());
		System.out.println("CGPA : "+s2.getCgpa());
		System.out.println("Semester : "+s2.getSemester());
		System.out.println("-------------------------------");
		
		System.out.println("Name : "+s3.getName());
		System.out.println("ID : "+s3.getId());
		System.out.println("Department : "+s3.getDepartment());
		System.out.println("CGPA : "+s3.getCgpa());
		System.out.println("Semester : "+s3.getSemester());
		System.out.println("-------------------------------");
		
		System.out.println("Name : "+s4.getName());
		System.out.println("ID : "+s4.getId());
		System.out.println("Department : "+s4.getDepartment());
		System.out.println("CGPA : "+s4.getCgpa());
		System.out.println("Semester : "+s4.getSemester());
		System.out.println("-------------------------------");
	}
}