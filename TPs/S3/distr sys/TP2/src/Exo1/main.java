package Exo1;

public class main {

	public static void main(String[] args) {
		
		JobTotoEtTiti jobinterface = new JobTotoEtTiti();
		
		
		Thread toto = new Thread(jobinterface, "Toto");
		
		Thread titi = new Thread(jobinterface, "Titi");
		
		toto.start();
		titi.start();

	}

}
