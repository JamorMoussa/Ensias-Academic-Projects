package Exo1;

public class Thread_1_to_10 implements Runnable{
	
	public void run() {
		
		for(int i=1; i <=10; i++) {
			System.out.print(i);
		}
	}
	
}