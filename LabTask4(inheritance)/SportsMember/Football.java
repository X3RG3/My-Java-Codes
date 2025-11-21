public class Football extends Player{
	private String position;
	private int goals;
	
	public Football(){
		System.out.println("Empty cons for football ");
	}
	public Football(String name,int age,String country,String position,int goals){
		super(name,age,country);
		this.position=position;
		this.goals=goals;
		System.out.println("Para cons for football ");
	}
	
	public void setPosition(String position){
		this.position=position;
	}
	public void setGoals(int goals){
		this.goals=goals;
	}
	
	public String getPosition(){
		return position;
	}
	public int getGoals(){
		return goals;
	}
	
	public void Details(){
		super.Details();
		System.out.println("Position : "+position);
		System.out.println("Goals : "+goals);
	}
}