package iterator;

import java.util.Iterator;

/**
 * The representation of "sequence of non-negative even numbers"
 * @author Daniel
 */
public class EvenIterable implements Iterable<Integer>{
	int maxValue = Integer.MAX_VALUE;
	
	public EvenIterable() {}
	
	public EvenIterable(int maxValue){
		this.maxValue = maxValue;
	}
	
	@Override
	public Iterator<Integer> iterator() {		
		return new EvenIterator(maxValue);
	}
	
	
	/**
	 * Test
	 */
	public static void main(String[] args) {
		// Test for array:
		//  arr - simple "iterable" collection
		//  i   - index is simple "iterator"
		int arr[] = {11,22,33};
		for (int i =0; i < arr.length; ) {
			int x = arr[i++];
			System.out.println(x);
		}
		
		System.out.println("===========");

		// foreach for array
		for(int x: arr) {
			System.out.println(x);
		}
		
		System.out.println("===========");
		
		// Test for Iterable and Iterator:
		EvenIterable collection = new EvenIterable(10);
		
		Iterator<Integer> it = collection.iterator();
		while (it.hasNext()){
		    Integer x = it.next();
		    System.out.println(x);
		}
		
		System.out.println("===========");
		
		// foreach for Iterable
		for (Integer x: collection) {
			System.out.println(x);
		}
		
	}

}
