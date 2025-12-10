public class Start{
	public static void main(String[] args){
		Book b1= new Book("Java The Complete reference","Herbert Schildt");
		Book b2= new Book("Head First Java","Bert Bates");
		Student s1 = new Student("Irfan",62274,b1);
		Student s2 = new Student("Iqram",62223,b2);
		s1.Details();
		s2.Details();
	}
}