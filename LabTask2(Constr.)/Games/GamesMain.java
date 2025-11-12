public class GamesMain{
	public static void main(String[] args){
		Game g1=new Game("GTA 5","Rockstar", 40F,5F,115F);
		Game g2=new Game();
		Game g3=new Game("Assasian's Creed ", "Ubisoft", 59.99F,4.9F,150F);
		Game g4=new Game();
		
		
		g1.Details();
		g2.Details();
		g3.Details();
		g4.Details();
		
		
	}
}