public class Author{
	private String Aname;
	Book[] b;
	public Author(){}
	public Author(String Aname,Book[] b){
		this.Aname=Aname;
		this.b=b;
	}
	
	public void ADetails(){
		System.out.println("Author Name : "+Aname);
		for(int i=0;i<b.length;i++){
			b[i].BDetails();
		}
	}
}