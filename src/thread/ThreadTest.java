package thread;

public class ThreadTest extends Thread {

	public void start() {
		for (int i = 0; i < 5; i++) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(i);
		}
	}

	public static void main(String[] args) {
		ThreadTest tH = new ThreadTest();
		tH.start();
	}

}
