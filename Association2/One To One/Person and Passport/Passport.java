public class Passport{
	private int PassNum;
	private String nationality;
	private String expiryDate;
	
	public Passport(){}
	
	public Passport(int PassNum, String nationality,String expiryDate){
		this.PassNum=PassNum;
		this.nationality=nationality;
		this.expiryDate=expiryDate;
	}
	
	public void setPassNum(int PassNum){
		this.PassNum=PassNum;
	}
	public int getPassNum(){
		return PassNum;
	}
	
	public void setNationality(String nationality){
		this.nationality=nationality;
	}
	public String getNationality(){
		return nationality;
	}
	
	public void setExpiryDate(String expiryDate){
		this.expiryDate=expiryDate;
	}
	public String getExpiryDate(){
		return expiryDate;
	}
	
	public void Details(){
		System.out.println("Passport Number : "+PassNum);
		System.out.println("Nationality : "+nationality);
		System.out.println("Expiry Date : "+expiryDate);
	}
}