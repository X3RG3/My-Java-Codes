import java.lang.*;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
public class Test{
	public static  void main(String[] args){
		try{
			BufferedWriter writer = new BufferedWriter(new FileWriter("output.txt"));
			writer.write("Writing to a file");
			writer.write("Hello Hello");
			writer.close();
		}
		catch(IOException e){
			e.printStackTrace();
		}
	}
}