package video3;

public class main {

	public static void main(String[] args) {
		System.out.println(Thread.currentThread().getName());
		
		for (var i = 0; i < 10; i++) {
			Thread thread = new Thread (new DownloadFileTask());
			thread.start();
		}
	}

}
