package recursion;

public class Recursion {

	public static void main(String[] args) {
		System.out.println(factorial(5));
		System.out.println(fibonacci(3));
	}

	private static int factorial(int n) {
		return n > 1 ? (n) * factorial(n - 1) : 1;
	}

	private static int fibonacci(int n) {
		return n < 2? n :fibonacci(n - 1) + fibonacci(n - 2);
	}
}