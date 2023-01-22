package predicate;

import java.util.ArrayList;
import java.util.function.Predicate;

class Person {

	private double weight;

	public Person(double weight) { // constructor of Person
		this.weight = weight;
	}

	public final double getWeight() {
		return weight;
	}
}

class Company {

	private ArrayList<Person> arrOfStuff; // array of some persons

	Company(ArrayList<Person> arrOfStuff) { // constructor of Company
		this.arrOfStuff = arrOfStuff;
	}

	public final void addToCompany(Person p1) { // add Person to arrOfStuff
		arrOfStuff.add(p1);
	}

	public ArrayList<Person> findPerson(Predicate<Person> predicate) { 	// method to find some person from ArrayList
																		// according to any predicate
		ArrayList<Person> tempArr = new ArrayList<>();
		for (int i = 0; i < arrOfStuff.size(); i++) {
			if (predicate.test(arrOfStuff.get(i))) {
				tempArr.add(arrOfStuff.get(i));
			}
		}
		return tempArr;
	}
}

class FindPersonHeavierThen implements Predicate<Person> {

	// object of this class will be compared to every object in the source array
	int minWeight;

	public FindPersonHeavierThen(int minWeight) {
		this.minWeight = minWeight;
	}

	// comparing algorithm
	@Override
	public boolean test(Person t) {
		return t.getWeight() >= minWeight;
	}
}

class FindPersonEasierThen implements Predicate<Person> {

	// object of this class will be compared to every object in the source array
	int maxWeight;

	public FindPersonEasierThen(int maxWeight) {
		this.maxWeight = maxWeight;
	}

	// comparing algorithm
	@Override
	public boolean test(Person t) {
		return t.getWeight() <= maxWeight;
	}
}

public class PredicateUsing {

	public static void main(String[] args) {

		Person p1 = new Person(0);
		Person p2 = new Person(32);
		Person p3 = new Person(45);
		Person p4 = new Person(53);
		Person p5 = new Person(65);
		Person p6 = new Person(86);
		Person p7 = new Person(93);
		Person[] arrOfPers = { p1, p2, p3, p4, p5, p6, p7 };

		Company someComp = new Company(new ArrayList<Person>());

		for (int i = 0; i < arrOfPers.length; i++) {
			someComp.addToCompany(arrOfPers[i]);
		}

		ArrayList<Person> one = new ArrayList<>();
		one.add(p6);
		one.add(p7);
		
		ArrayList<Person> two = new ArrayList<>();
		two.add(p1);
		two.add(p2);
		two.add(p3);

		boolean b1 = one.equals(someComp.findPerson(new FindPersonHeavierThen(80)));
		System.out.println(b1);
		
		boolean b2 = two.equals(someComp.findPerson(new FindPersonEasierThen(50)));
		System.out.println(b2);
	}
}
