public class Main{
	public static void main(String[] args){
		Book[] b = new Book[3];
		b[0]=new Book("Samyabadi",1234);
		b[1]=new Book("Agnibeena",12345);
		b[2]=new Book("Shanchita",12344);
		
		Author a = new Author("Kazi Nazrul Islam",b);
		
		a.ADetails();
	}
}