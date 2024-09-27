package lamda;

public class ImplementingRunnable {

	public static void main(String[] args) {
		Runnable runnable = () -> System.out.println("Thread is running");
		new Thread(runnable).start();
	}

}
