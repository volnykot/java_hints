package lambda;

public class Radio implements ElectricityConsumer {
	
	void playMusic() {
		System.out.println("radio    is on");
	}

	@Override
	public void electricityOn(Object obj) {
		playMusic();		
	}
}
