public class StudentMain{
	public static void main(String[] args){
		Student s1=new Student("Irfan",62274, "CSE", 3.93F, "2nd");
		Student s2=new Student();
		Student s3=new Student("Ayon",62245, "EEE", 9.88F,"3rd");
		Student s4=new Student();
		
		s1.Details();
		s2.Details();
		s3.Details();
		s4.Details();
		
	}
}