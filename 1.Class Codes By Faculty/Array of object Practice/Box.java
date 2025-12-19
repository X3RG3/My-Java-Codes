import java.lang.*;

public class Box
{
	private float length;
	private float height;
	private float width;
	
	public Box()
	{
		System.out.println("Empty for box");
	}
	
	public Box(float length,float height,float width)
	{
		this.length=length;
		this.height=height;
		this.width=width;
		System.out.println("Pera for Box");
	}
	
	public void setLength(float length)
	{
		this.length=length;
	}
	
	public float getLength()
	{
		return length;
	}
	
	public void setHeight(float height)
	{
		this.height=height;
	}
	
	public float getHeight()
	{
		return height;
	}
	
	public void setWidth(float width)
	{
		this.width=width;
	}
	
	public float getWidth()
	{
		return width;
	}
	
	public void details()
	{
		System.out.println("Length: "+length+"\n"+"Height: "+height+"\n"+"Width: "+width);
	}
	
	
}