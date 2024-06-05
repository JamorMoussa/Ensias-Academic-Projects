package Exo2;

public class Banque {
	
	final double[] comptes;
	
	public Banque(int NumCompts, int init_sold) {
		comptes = new double[NumCompts];
		_init_Compt(init_sold);
	}
	
	private void _init_Compt(int init_sold) {
		for (int i = 0; i < comptes.length; i++) {
			comptes[i] = init_sold;
		}
	}
	
	public void transfer(int from , int to, double montant ) {
		if(comptes[from] >= montant) {
			comptes[from] -= montant;
			comptes[to] += montant;
			//System.out.println("Account "+ from + " send, ammount " + montant + " to " + to + " account");
		}else{
			System.out.println("The account " + from + " don't have monney to send");
			System.out.println("The balance of " + from + " is " + comptes[from]);
		}
	}

}
