import java.lang.*;
public class TypeCasting{
	public static void main(String[] args){
		//2 types of type casting
		//Implicit and Explicit
		int i1 =10;
		double d1 = 123.232;
		System.out.println("Before Implicit i1: "+i1);
		System.out.println("Before Implicit d1: "+d1);
		d1 = i1;
		System.out.println("After Implicit i1: "+i1);
		System.out.println("After Implicit d1: "+d1);
		int i2 = 12;
		double d2 = 123.432;
		System.out.println("Before Explicit i2: "+i2);
		System.out.println("Before Explicit d2: "+d2);
		i2 =(int)d2;
		System.out.println("After Explicit i2: "+i2);
		System.out.println("After Explicit d2: "+d2);
	}
}