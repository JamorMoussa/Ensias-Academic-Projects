package Exo1;


public class main {

	public static void main(String[] args) {
		
		Thread_1_to_10 t1_10 = new Thread_1_to_10();
		Thread_a_to_z ta_z = new Thread_a_to_z();
		
		
		Thread t1 = new Thread(t1_10);
		Thread t2 = new Thread(ta_z);
		
		t1.start();
		t2.start();
		
		/* non on ne peut pas derterminer le résulat préalable car le deux thread s'execute en même temps :
		* voici le résultat des certaines executions : 
		* 1abcdefghijklmnopqrstuvwxyz2345678910
		* 12345678910abcdefghijklmnopqrstuvwxyz
		*/
	}
	
}
