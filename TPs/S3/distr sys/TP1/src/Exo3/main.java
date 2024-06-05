package Exo3;

public class main {

	public static void main(String[] args) {
		
		HorlogeGraphique hg = new HorlogeGraphique();
		
		HorlogeThreadInterface hgInterface = new HorlogeThreadInterface();
		hgInterface.hg = hg;
		
		Thread hgThread = new Thread(hgInterface);
		
		hgThread.start();
		
		hg.setVisible(true);

	}

}
