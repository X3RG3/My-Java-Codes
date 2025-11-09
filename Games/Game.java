public class Game{
	private String name;
	private String company;
	private float price;
	private float rating;
	private float size;
	
	public void setName(String name){
		this.name=name;
	}
	public String getName(){
		return name;
	}
	
	public void setCompany(String company){
		this.company=company;
	}
	public String getCompany(){
		return company;
	}
	
	public void setPrice(float price){
		this.price=price;
	}
	public float getPrice(){
		return price;
	}
	
	public void setRating(float rating){
		this.rating=rating;
	}
	public float getRating(){
		return rating;
	}
	
	public void setSize(float size){
		this.size=size;
	}
	public float getSize(){
		return size;
	}
}