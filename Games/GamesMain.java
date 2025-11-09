public class GamesMain{
	public static void main(String[] args){
		Game g1=new Game();
		Game g2=new Game();
		Game g3=new Game();
		Game g4=new Game();
		
		g1.setName("GTA5");
		g1.setCompany("Rockstar");
		g1.setPrice(40f);
		g1.setRating(5f);
		g1.setSize(115f);
		
		g2.setName("Assassin's Creed");
		g2.setCompany("Ubisoft");
		g2.setPrice(59.99f);
		g2.setRating(4.9f);
		g2.setSize(150f);
		
		g3.setName("RDR2");
		g3.setCompany("Rockstar");
		g3.setPrice(39.99f);
		g3.setRating(5f);
		g3.setSize(155f);
		
		g4.setName("FarCry");
		g4.setCompany("Ubisoft");
		g4.setPrice(56.99f);
		g4.setRating(4.8f);
		g4.setSize(50f);
		
		System.out.println("----------Game List----------");
		System.out.println("Game Name : "+ g1.getName());
		System.out.println("Company : "+g1.getCompany());
		System.out.println("Price : "+g1.getPrice()+"$");
		System.out.println("Rating : "+g1.getRating());
		System.out.println("Game Size : "+g1.getSize()+"GB");
		System.out.println("-------------------------------");
		
		System.out.println("Game Name : "+ g2.getName());
		System.out.println("Company : "+g2.getCompany());
		System.out.println("Price : "+g2.getPrice()+"$");
		System.out.println("Rating : "+g2.getRating());
		System.out.println("Game Size : "+g2.getSize()+"GB");
		System.out.println("-------------------------------");
		
		System.out.println("Game Name : "+ g3.getName());
		System.out.println("Company : "+g3.getCompany());
		System.out.println("Price : "+g3.getPrice()+"$");
		System.out.println("Rating : "+g3.getRating());
		System.out.println("Game Size : "+g3.getSize()+"GB");
		System.out.println("-------------------------------");
		
		System.out.println("Game Name : "+ g4.getName());
		System.out.println("Company : "+g4.getCompany());
		System.out.println("Price : "+g4.getPrice()+"$");
		System.out.println("Rating : "+g4.getRating());
		System.out.println("Game Size : "+g4.getSize()+"GB");
		
	}
}