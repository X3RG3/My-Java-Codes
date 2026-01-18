package Entities;

import java.lang.*;
import java.util.*;
import javax.swing.*;
import java.io.*;
import Framesd.*;

public class Account
{
	private String uname;
	private String upass;
	
	private File myfile;
	private FileWriter fwriter;
	private Scanner sc;
	
	public Account()
	{
		
	}
	
	public Account(String uname,String upass)
	{
		this.uname=uname;
		this.upass=upass;
	}
	
	public void setUname(String uname)
	{
		this.uname=uname;
	}
	
	public String getUname()
	{
		return uname;
	}
	
	public void setUpass(String upass)
	{
		this.upass=upass;
	}
	
	public String getUpass()
	{
		return upass;
	}
	
	public void addAccount()
	{
		try
		{
			myfile=new File("./Datas/Data.txt");
			myfile.createNewFile();
			fwriter=new FileWriter(myfile,true);
			
			fwriter.write(getUname()+"\t");
			fwriter.write(getUpass()+"\n");
			
			fwriter.flush();
			fwriter.close();
			
		}
		catch(IOException ioe)
		{
			ioe.printStackTrace();
		}
	}
	
	public boolean getAccount(String name,String pass)
	{
		boolean flag=false;
		try
		{
			myfile=new File("./Datas/Data.txt");
			sc=new Scanner(myfile);
			
			while(sc.hasNextLine())
			{
				String line=sc.nextLine();
				String[] value=line.split("\t");
				if(value[0].equals(name)&&value[1].equals(pass))
				{
					flag=true;
				}
			}
			
		}
		catch(IOException ioe)
		{
			ioe.printStackTrace();
		}
		
		return flag;
	}
	
	
	
}