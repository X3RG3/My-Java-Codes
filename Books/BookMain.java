public class BookMain{
	public static void main(String[] args){
		Book b1 = new Book();
		
		Book b2 = new Book("The Alchemist","Paulo Coelho",300.00);
		
		System.out.println("Book 1 Details : ");
		b1.display();
		
		System.out.println("Book 2 Details : ");
		b2.display();
	}
}