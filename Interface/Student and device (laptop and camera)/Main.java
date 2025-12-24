public class Main{
	public static void main(String[] args){
		Device d1 = new Laptop(111,55000,16.5f);
		Device d2 = new Laptop(222,65000,17.5f);
		
		Device d3= new Camera(333,75000,"Mirrorless");
		Device d4 = new Camera(444,85000,"DSLR");
		
		OpStudent Ops = new Student(62274,"Md. Irfan", 5);
		
		Ops.insert(d1);
		Ops.insert(d2);
		Ops.insert(d3);
		Ops.insert(d4);
		
		Ops.delete(d3);
		Ops.Details();
	}
}