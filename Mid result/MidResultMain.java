public class MidResultMain{
	public static void main(String[] args){
		MidResult r1=new MidResult();
		MidResult r2=new MidResult();
		MidResult r3=new MidResult();
		MidResult r4=new MidResult();
		
		r1.setCourse("Introduction to Programming");
		r1.setFaculty("Mashiur Rahman");
		r1.setGrade("A+");
		r1.setMark(97);
		r1.setCredit(3);
		
		r2.setCourse("Introduction to Programming Lab");
		r2.setFaculty("Sifat");
		r2.setGrade("B");
		r2.setMark(67);
		r2.setCredit(1);
		
		r3.setCourse("English Reading and Public Speaking");
		r3.setFaculty("Kaspia Sultana");
		r3.setGrade("A+");
		r3.setMark(93);
		r3.setCredit(3);
		
		r4.setCourse("Differential Calculus");
		r4.setFaculty("Habib");
		r4.setGrade("A+");
		r4.setMark(98);
		r4.setCredit(3);
		
		System.out.println("----------Mid Result----------");
		System.out.println("Course : "+r1.getCourse());
		System.out.println("Faculty : "+r1.getFaculty());
		System.out.println("Grade : "+r1.getGrade());
		System.out.println("Mark : "+r1.getMark());
		System.out.println("Credit Hour : "+r1.getCredit());
		System.out.println("---------------------------------");
		
		System.out.println("Course : "+r2.getCourse());
		System.out.println("Faculty : "+r2.getFaculty());
		System.out.println("Grade : "+r2.getGrade());
		System.out.println("Mark : "+r2.getMark());
		System.out.println("Credit Hour : "+r2.getCredit());
		System.out.println("---------------------------------");
		
		System.out.println("Course : "+r3.getCourse());
		System.out.println("Faculty : "+r3.getFaculty());
		System.out.println("Grade : "+r3.getGrade());
		System.out.println("Mark : "+r3.getMark());
		System.out.println("Credit Hour : "+r3.getCredit());
		System.out.println("---------------------------------");
		
		System.out.println("Course : "+r4.getCourse());
		System.out.println("Faculty : "+r4.getFaculty());
		System.out.println("Grade : "+r4.getGrade());
		System.out.println("Mark : "+r4.getMark());
		System.out.println("Credit Hour : "+r4.getCredit());
	}
}