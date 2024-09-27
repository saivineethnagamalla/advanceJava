package thread;

public class ThreadRunnableExample implements Runnable {

	@Override
	public void run() {
		System.out.println("Thread name is : " + Thread.currentThread().getName());

	}

	public static void main(String[] args) {
		ThreadRunnableExample runnable = new ThreadRunnableExample();
		Thread thr = new Thread(runnable);
		thr.run();

	}

}
