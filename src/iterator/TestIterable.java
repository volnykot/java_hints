package iterator;

import java.util.Iterator;
import java.util.NoSuchElementException;
import basis.Person;
import java.util.ArrayList;
import static basis.Person.*;

public class TestIterable {
	public static void main(String[] args) {

		CompanyIterable company = new CompanyIterable(new ArrayList<>());

		/*
		 * fill ArrayList of the iterable class "CompanyIterable" with objects of Person
		 */
		for (int i = 0; i < arrOfPers.length; i++) {
			company.addToCompany(arrOfPers[i]);
		}

		/*
		 * iterating using foreach loop
		 */
		for (Person p : company) {
			System.out.println(p.toString());
		}
	}
}

class CompanyIterable implements Iterable<Person> {

	ArrayList<Person> tempArrayListA;

	CompanyIterable(ArrayList<Person> tempArrayListA) {
		this.tempArrayListA = tempArrayListA;
	}

	/*
	 * add Person to tempArrayListA
	 */
	public final void addToCompany(Person p1) {
		tempArrayListA.add(p1);
	}

	/*
	 * every time user calls an Itarator, this method creates new Iterator to begin
	 * iterating from the beginning of ArrayList
	 */
	@Override
	public Iterator<Person> iterator() {
		return new CustomIterator(tempArrayListA);
	}

	public class CustomIterator implements Iterator<Person> {

		int indexPos = 0;
		ArrayList<Person> tempArrayListB;

		CustomIterator(ArrayList<Person> tempArrayListB) {
			this.tempArrayListB = tempArrayListB;
		}

		/*
		 * check if there is next element in the given ArrayList
		 * if not -> loop aborts
		 * */
		@Override
		public boolean hasNext() {
			return indexPos + 2 <= tempArrayListB.size();
		}

		@Override
		public Person next() {
			/*
			 * check if the 1st suitable element exists in the input collection
			 */
			if (!hasNext()) {
				throw new NoSuchElementException();
			}
			/*
			 * every 2nd element will be skipped
			 */
			Person temp = tempArrayListB.get(indexPos);
			indexPos += 2;
			return temp;
		}
	}
}
