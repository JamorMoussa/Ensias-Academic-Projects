package Exo2;

import java.util.Random;

public class MyThread extends Thread {
	
	public String name;
	
	public Random random = new Random();
	
	public void run() {
		for(int i = 0; i<5 ; i++) {
			try {
				Thread.sleep(random.nextInt(101));
				System.out.print(name + '\n');
			} catch (InterruptedException e) {
				System.out.print(e);
			}
		}
	}

}
