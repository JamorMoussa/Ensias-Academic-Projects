package Exo2;

import java.util.Iterator;
import java.util.Random;

public class main {

	public static void main(String[] args) {

		Banque banque = new Banque(100, 1000);
		
		for (int i = 0; i < banque.comptes.length; i++) {
			
			System.out.println(banque.comptes[i]);
	
		}
	
		Random random = new Random();
		
		int to, from;
		Transfert tr;
		
		while(true) {
			
			from = random.nextInt(100);
			
			to = random.nextInt(100);
			
			tr = new Transfert(banque, from, to);
		
			new Thread(tr).start();
		}
	}
}


