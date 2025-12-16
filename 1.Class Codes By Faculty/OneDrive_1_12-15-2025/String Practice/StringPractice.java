import java.lang.*;

public class StringPractice
{
	public static void main(String[] args)
	{
		String s1="Bangladesh";
		String s2=s1.toUpperCase();//BANGLADESH
		
		System.out.println(s1.length());
		System.out.println(s1.charAt(6));
		System.out.println(s1.indexOf('a'));
		System.out.println(s1.toUpperCase());
		System.out.println(s1.toLowerCase());
		System.out.println(s1.isEmpty());
		System.out.println(s1.substring(3,7));
		
		String s5="Dhaka";
		String s6="Dhaka";
		String s7=new String("Dhaka");
		String s8=new String("Dhaka");
		
		System.out.println(s6.compareTo(s5));
		
		if(s5.equals(s7))
		{
			System.out.println("1");
		}
		else
		{
			System.out.println("2");
		}
		
		String s11[]=new String[]{"java","Aiub","C++"};
		String s22[]=new String[]{"java","c++","Aiub"};
		
		System.out.println(s11[2].equals(s22[2]));
		
	}
}