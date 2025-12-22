public class Main{
	public static void main(String[] args){
		Patient p1=new Patient("Irfan","Demra");
		Patient p2=new Patient("Iqram","Dhanmondi");
		Patient p3=new Patient("Ayon","Badda");
		
		Doctor d=new Doctor("Mr. X",111,"MBBS",3);
		
		d.insert(p1);
		d.insert(p2);
		d.insert(p3);
		
		d.delete(p2);
		d.update(p3,"Narayanganj");
		d.Details();
	}
}