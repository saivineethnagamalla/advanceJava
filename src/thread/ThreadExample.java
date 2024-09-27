package thread;

public class ThreadExample extends Thread {

	public void testStrat() {
		System.out.println("Thread is runnning with name: " +Thread.currentThread().getName());
	}

	public static void main(String[] args) {

		ThreadExample tE = new ThreadExample();
		tE.testStrat();

	}

}
