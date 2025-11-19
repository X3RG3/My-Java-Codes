import java.lang.*;
public class CarMain{
	public static void main(String[] args){
		Car c1=new Car("Ford Escort", "Lime");
		Car c2=new Car("Nissan Skyline GTR", "Blue");
		Car c3=new Car("Porsche 911", "Black");
		
		Car[] cars = {c1,c2,c3};
		
		for(int i=0;i<cars.length;i++){
			cars[i].Display();
		}
	}
}