package Exo1;

public class Compte {
	
	private float sold = 1000;
	
	public float get_sold() {
		return sold;
	}
	
	public float retirer_sold(float montant) {
		sold -= montant;
		return montant;
	}

}
