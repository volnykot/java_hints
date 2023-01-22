package executors_stuff;

public class MyRunnable implements Runnable {
	@Override
	public void run() {
		try {
			
			System.out.println("Start runnable" + Thread.currentThread().getName());
			Thread.sleep(1000);
			System.out.println("Finish runnable" + Thread.currentThread().getName());
			
		}catch (Exception e) {
		}

	}
}
