package test;

import java.util.concurrent.*;
import java.util.stream.IntStream;

public class FailedTestThreadPoolExecutor {

	private static final int N_THREADS = 100;

	public static void main(String[] args) {
		BlockingQueue<Runnable> queue = new ArrayBlockingQueue<>(100);

		ThreadPoolExecutor tpu = new ThreadPoolExecutor(5, 10, 5, TimeUnit.MILLISECONDS, queue);

		IntStream.range(1, N_THREADS+1)
		.mapToObj(RunnableClass::new)
		.forEach(tpu::execute);
		
		tpu.shutdown();
	}
}

class RunnableClass implements Runnable {
	int number;
	RunnableClass (int number) {
		this.number = number;
	}
	
	@Override
	public void run() {
		try {
			System.out.printf("%2d Thread ++++++++;%n", number);
			Thread.sleep(3000);
			System.out.printf("%2d Thread --------;%n", number);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}