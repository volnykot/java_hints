package executors_stuff;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.stream.IntStream;

public class Starter {
	private static final int N_STREAM = 0;

	public static void main(String[] args) { 
		ExecutorService service = Executors.newFixedThreadPool(2);
		
		IntStream.range(0, N_STREAM).forEach(i -> {
			
		});
	}

}

interface int1 {
	void a ();
}
interface int2 extends int1 {
	
}