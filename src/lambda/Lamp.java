package lambda;

public class Lamp implements ElectricityConsumer{

	@Override
	public void electricityOn(Object obj) {
		System.out.println("lamp     is on");
	}

}
