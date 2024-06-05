package Exo4;

public class main {

	public static void main(String[] args) {

		RabitThread rbThread = new RabitThread();
		TortoiseThread torThread = new TortoiseThread();
		
		rbThread.start();
		torThread.start();
		
	}
}
