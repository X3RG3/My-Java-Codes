import java.lang.*;
import java.util.*;
public class Array{
	public static void main(String[] args){
	String[] names = new String[4];
	
	Scanner input= new Scanner(System.in);
	
	for(int i=0;i<names.length;i++){
		System.out.println("Input Name "+i+" : ");
		names[i]=input.nextLine();
	}
	
	for(int i=0;i<names.length;i++){
		System.out.println("Name "+i+" : "+ names[i]);
	}
}
}