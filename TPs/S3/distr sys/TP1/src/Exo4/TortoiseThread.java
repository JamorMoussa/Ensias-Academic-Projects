package Exo4;

public class TortoiseThread extends Thread{
	
	@Override
	public void run() {
		System.out.println("The tortoise starts the race..");
		try {
			Thread.sleep(10);
	        for (int i = 0; i < 5; i++) {
	            	System.out.println("La tortue se déplace lentement...");
	                Thread.sleep(1000);
	            }
	 	} catch (InterruptedException e) {
	 		System.out.println(e);
	 	}
        System.out.println("The turtle won the race !");
	}
}
