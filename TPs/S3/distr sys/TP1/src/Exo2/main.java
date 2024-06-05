package Exo2;

public class main {

	public static void main(String[] args) {
		
		MyThread t1 = new MyThread();
		t1.name = "t1";
		
		MyThread t2 = new MyThread();
		t2.name = "t2";
		
		MyThread t3 = new MyThread();
		t3.name = "t3";
		
		t1.start();
		t2.start();
		t3.start();
	}

}
