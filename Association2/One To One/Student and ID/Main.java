public class Main{
	public static void main (String[] args){
		ID id1 = new ID(62274,"05/08/25");
		
		Student s = new Student("Irfan",123,id1);
		
		s.Details();
	}
}