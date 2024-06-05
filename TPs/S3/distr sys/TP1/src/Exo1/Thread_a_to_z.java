package Exo1;

public class Thread_a_to_z implements Runnable{
	
	public void run() {
		for(char i= 'a'; i <= 'z'; i++) {
			System.out.print(i);
		}
	}
}
