import java.lang.*;
public class Coder extends Person{
	private String language;
	private int experience;
	
	public Coder(){
		System.out.println("Empty cons for Coder");
	}
	public Coder(String name,int age,String city,String language,int experience){
		super(name,age,city);
		this.language=language;
		this.experience=experience;
		System.out.println("Pera cons for Coder");
	}
	public void setLang(String language){
		this.language=language;
	}
	public String getLang(){
		return language;
	}
	public void setExp(int experience){
		this.experience=experience;
	}
	public int getExp(){
		return experience;
	}
	
	public void Details(){
		super.Details();
		System.out.println("Coding Language : "+language);
		System.out.println("Coding experience : "+experience);
	}
}