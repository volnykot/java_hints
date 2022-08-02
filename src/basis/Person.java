package basis;

public class Person {

	
	private double weight;

	public Person(double weight) {
		this.weight = weight;
	}

	public final double getWeight() {
		return weight;
	}
	
	@Override
	public String toString () {
		return "my weight is " + this.weight + ";";
	}
	
	public static Person p1 = new Person(0);
	public static Person p2 = new Person(32);
	public static Person p3 = new Person(45);
	public static Person p4 = new Person(53);
	public static Person p5 = new Person(65);
	public static Person p6 = new Person(86);
	public static Person p7 = new Person(93);
	public static Person[] arrOfPers = { p1, p2, p3, p4, p5, p6, p7 };
	

}
