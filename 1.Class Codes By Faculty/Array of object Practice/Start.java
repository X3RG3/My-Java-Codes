import java.lang.*;
import java.util.*;

public class Start 
{
	public static void main(String[] args)
	{
		Scanner obj=new Scanner(System.in);
		
		/*Box b1=new Box();
		Box b2=new Box(25.4F,35.5F,45.5F);*/
		
		Box boxes[]=new Box[5];
		
		/*boxes[0]=b1;
		boxes[1]=b2;
		boxes[3]=new Box(110,200,300);
		boxes[4]=new Box();
		
		
		b1.setLength(55.5F);
		boxes[0].setHeight(75.5F);*/
		/*b1.details();
		boxes[0].details();
		
		boxes[3].details();*/
		/*boxes[4].setLength(5.5F);
		boxes[4].setWidth(15.5F);*/
		/*boxes[4].details();*/
		
		for(int i=0;i<boxes.length;i++)
		{
			System.out.println("Give Length");
			float l=obj.nextFloat();
			System.out.println("Give Height");
			float h=obj.nextFloat();
			System.out.println("Give Width");
			float w=obj.nextFloat();
			boxes[i]=new Box(l,h,w);
		}
		
		
		for(int i=0;i<boxes.length;i++)
		{
			if(boxes[i]!=null)
			{
				boxes[i].details();
			}
			else
			{
				System.out.println("Null Index");
			}
		}
		
	}
}