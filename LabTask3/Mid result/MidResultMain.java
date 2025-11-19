public class MidResultMain{
	public static void main(String[] args){
		MidResult r1=new MidResult("Introduction to Programming","Mashiur Rahman","A+",97,3);
		MidResult r2=new MidResult();
		MidResult r3=new MidResult("English Reading and Public Speaking","Kaspia Sultana","A+",93,3);
		MidResult r4=new MidResult();
		
		MidResult[] r ={r1,r2,r3,r4};
		for(int i=0;i<r.length;i++){
			r[i].Details();
		}
		
	}
}