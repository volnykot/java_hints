package iterator;

import java.util.Iterator;
import java.util.NoSuchElementException;

/**
 * The iterator over non-negative even numbers beginning from 0
 * @author Daniel
 */
public class EvenIterator implements Iterator<Integer> {

	int nextValue = 0;
	int maxValue = Integer.MAX_VALUE;
	
	EvenIterator(){}
	
	EvenIterator(int maxValue){
		this.maxValue = maxValue;
	}
	
	@Override
	public boolean hasNext() {
		return (nextValue >=0 && nextValue <= maxValue);
	}

	@Override
	public Integer next() {
		if (!hasNext()) {
			throw new NoSuchElementException();
		}
		Integer cur = nextValue;
		nextValue = nextValue + 2; // calculate next
		return cur;
	}

	/**
	 * Test
	 */
	public static void main(String[] args) {
		EvenIterator it = new EvenIterator(10);
		while (it.hasNext()){
		    Integer x = it.next();
		    System.out.println(x);
		}
	}
}
