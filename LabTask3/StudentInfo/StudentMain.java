public class StudentMain{
	public static void main(String[] args){
		Student s1=new Student("Irfan",62274, "CSE", 3.93F, "2nd");
		Student s2=new Student();
		Student s3=new Student("Ayon",62245, "EEE", 9.88F,"3rd");
		Student s4=new Student();
		
		Student[] s = {s1,s2,s3,s4};
		
		for(int i=0;i<s.length;i++){
			s[i].Details();
		}
		
	}
}