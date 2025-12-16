public class ID{
	private int idNum;
	private String issueDate;
	
	public ID(){}
	
	public ID(int idNum,String issueDate){
		this.idNum=idNum;
		this.issueDate=issueDate;
	}
	
	public void setId(int idNum){
		this.idNum=idNum;
	}
	public int getId(){
		return idNum;
	}
	
	public void setIssueDate(String issueDate){
		this.issueDate=issueDate;
	}
	public String getIssueDate(){
		return issueDate;
	}
	
	public void Details(){
		System.out.println("ID Number : "+idNum);
		System.out.println("Issue Date : "+issueDate);
	}
}