public class MidResult{
	private String course;
	private String faculty;
	private String grade;
	private int mark;
	private int credit;
	
	public MidResult(){
		System.out.println("Empty cons for MidResult");
	}
	
	public MidResult(String course, String faculty,String grade,int  mark,int credit){
		this.course = course;
		this.faculty=faculty;
		this.grade=grade;
		this.mark=mark;
		this.credit=credit;
	}
	
	public void Details(){
		System.out.println("Course : "+course);
		System.out.println("Faculty : "+faculty);
		System.out.println("Grade : "+grade);
		System.out.println("Mark : "+mark);
		System.out.println("Credit : "+credit);
		System.out.println();
	}
}