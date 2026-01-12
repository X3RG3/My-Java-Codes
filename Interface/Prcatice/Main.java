public class Main{
	public static void main(String[] args){
		Device d1 = new Camera(111,50000,"DSLR");
		Device d2 = new Camera(222,90000,"MirorLess");
		Device d3 = new Headphone(333,5000,"Wireless");
		Device d4 = new Headphone(444,2500,"Wired");
		
		OPPerson Opp= new Person("Irfan", 21,5);
		
		Opp.insert(d1);
		Opp.insert(d2);
		Opp.insert(d3);
		Opp.insert(d4);
		
		Opp.delete(d2);
		Opp.update(d3,7000);
		
		Opp.Details();
	}
}