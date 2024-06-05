package Exo4;

public class RabitThread extends Thread{
	    @Override
	    public void run() {
	        System.out.println("The rabit starts the race.");
	        try {
	        	Thread.sleep(2500);
	        	System.out.println("The rabit is sleeping");
	            Thread.sleep(2500);
	        } catch (InterruptedException e) {
	            System.out.print(e);
	        }
	    }
	}