package lambda;
public class Programm {

	public static void fire(Object obj) {
		System.out.println("gorim!!!");
	}

	public static void main(String[] args) {
		Switcher sw = new Switcher();
		Lamp lamp = new Lamp();
		Radio radio = new Radio();
		// event subscribe
		sw.addElectricityListener(lamp);
		sw.addElectricityListener(radio);

		sw.addElectricityListener(obj -> System.out.println("huy"));

		sw.addElectricityListener(new ElectricityConsumer() {
			public void electricityOn(Object obj) {
				System.out.println("jopa");
			}
		});
		
//		var p = new Programm ();		//		if fire() is not static:
//		sw.addElectricityListener(p::fire);
//		sw.addElectricityListener(obj -> p.fire(obj));

		sw.addElectricityListener(Programm::fire);
		sw.addElectricityListener(obj -> Programm.fire(obj));

		sw.switchOn();
	}
}
