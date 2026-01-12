public class Person implements OPPerson{
	private String name;
	private int age;
	private Device D[];
	
	public Person(){}
	public Person(String name,int age,int size){
		this.name=name;
		this.age=age;
		D= new Device[size];
	}
	
	public void setName(String name){
		this.name=name;
	}
	public String getName(){
		return name;
	}
	public void setAge(int age){
		this.age=age;
	}
	public int getAge(){
		return age;
	}
	
	public void insert(Device d){
		for(int i=0;i<D.length;i++){
			if(D[i]==null){
				D[i]=d;
				break;
			}
		}
	}
	
	public void delete(Device d){
		for(int i=0;i<D.length;i++){
			if(D[i]==d){
				D[i]=null;
				break;
			}
			else{
				System.out.println("Not Found...!");
			}
		}
	}
	
	public void update(Device d,double p){
		for(int i=0;i<D.length;i++){
			if(D[i]==d){
				D[i].setPrice(p);
				break;
			}
			else{
				System.out.println("Invalid Device..!");
			}
		}
	}
	
	public void Details(){
		System.out.println("Person Name : "+name);
		System.out.println("Person age : "+age);
		System.out.println();
		
		for (int i=0;i<D.length;i++){
			if(D[i]!=null){
				D[i].Details();
			}
			else{
				System.out.println("Null Device...!!");
			}
		}
	}
}