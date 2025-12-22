public class Doctor{
	private String name;
	private int id;
	private String degree;
	private Patient patient[];
	
	public Doctor(){}
	public Doctor(String name,int id,String degree,int size){
		this.name=name;
		this.id=id;
		this.degree=degree;
		patient = new Patient[size];
	}
	
	public void insert(Patient p){
		for(int i=0;i<patient.length;i++){
			if(patient[i]==null){
				patient[i]=p;
				break;
			}
		}
	}
	
	public void delete(Patient p ){
		for(int i=0;i<patient.length;i++){
			if(patient[i]==p){
				patient[i]=null;
				break;
			}
			else{
				System.out.println("Not found");
			}
		}
	}
	
	public void update(Patient p, String a){
		for(int i=0;i<patient.length;i++){
			if(patient[i]==p){
				patient[i].setAddress(a);
				break;
			}
			else{
				System.out.println("Not found");
			}
		}
	}
	
	public void Details(){
		System.out.println("Doctor name : "+name);
		System.out.println("Doctor id : "+id);
		System.out.println("Degree : "+degree);
		
		for(int i=0;i<patient.length;i++){
			if(patient[i]!=null){
				patient[i].Details();
			}
			else{
				System.out.println("Null");
			}
			
		}
	}
}