package comparator;

import java.util.Arrays;

public class PersonComparable implements Comparable<PersonComparable> {

	int id;
	String name;
	double figers;

	public PersonComparable(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public String toString() {
		return id + " " + name;
	}

	@Override
	public int compareTo(PersonComparable o) {
		return (this.id > o.id)?1:(this.id < o.id)?-1:0;
	}

}

class Test {

	public static void main(String[] args) {

		PersonComparable p1 = new PersonComparable(111, "Ivan");
		PersonComparable p2 = new PersonComparable(222, "Oleg");
		PersonComparable p3 = new PersonComparable(333, "Pidj");
		PersonComparable p4 = new PersonComparable(444, "Sas");
		PersonComparable p5 = new PersonComparable(555, "Keka");
		PersonComparable p6 = new PersonComparable(666, "Boba");
		PersonComparable p7 = new PersonComparable(777, "Biba");

		PersonComparable[] persArr = { p1, p2, p3, p4, p5, p6, p7 }; // creates array of objects of class Person

		System.out.println("befor sorting = " + Arrays.toString(persArr));
		Arrays.sort(persArr);
		System.out.println("after sorting = " + Arrays.toString(persArr));

	}

}
