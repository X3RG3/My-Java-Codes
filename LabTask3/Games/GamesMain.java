public class GamesMain{
	public static void main(String[] args){
		Game g1=new Game("GTA 5","Rockstar", 40F,5F,115F);
		Game g2=new Game();
		Game g3=new Game("Assasian's Creed ", "Ubisoft", 59.99F,4.9F,150F);
		Game g4=new Game();
		
		Game[] g={g1,g2,g3,g4};
		
		for(int i=0;i<g.length;i++){
			g[i].Details();
		}
		
		
	}
}