package Exo2;


public class Transfert implements Runnable{
	
	public Banque banque;
	private int to, from;
	public double montant; 
	

	public Transfert(Banque banque, int from, int to) {
		this.banque = banque;
		this.to = to;
		this.from = from;
	}

	@Override
	public void run() {
			
		banque.transfer(from, to, 100);
	}

}
