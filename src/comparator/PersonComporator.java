package comparator;

import java.util.Arrays;
import java.util.Comparator;

class PersonComparator {

	int id;
	String name;

	public PersonComparator(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public String toString() {
		return id + " " + name;
	}
}

/*as a rule this class has to be created in a different package named "Comparators"*/
class ComporatorByID implements Comparator<PersonComparator> {

	@Override
	public int compare(PersonComparator p1, PersonComparator p2) {
		return Integer.compare(p1.id, p2.id);
	}

}

class Test2 {

	public static void main(String[] args) {

		PersonComparator p1 = new PersonComparator(111, "Ivan");
		PersonComparator p2 = new PersonComparator(222, "Oleg");
		PersonComparator p3 = new PersonComparator(333, "Pidj");
		PersonComparator p4 = new PersonComparator(444, "Sas");
		PersonComparator p5 = new PersonComparator(555, "Keka");
		PersonComparator p6 = new PersonComparator(666, "Boba");
		PersonComparator p7 = new PersonComparator(777, "Biba");

		PersonComparator [] persArr = { p1, p2, p3, p4, p5, p6, p7 }; // creates array of objects of class PersonComparator

		System.out.println("befor sorting = " + Arrays.toString(persArr));
		Arrays.sort(persArr, new ComporatorByID());
		System.out.println("after sorting = " + Arrays.toString(persArr));

	}

}
