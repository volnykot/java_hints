package lambda;

import java.util.*;

public class Switcher {

	private ArrayList<ElectricityConsumer> listeners = new ArrayList<>();

	public void addElectricityListener(ElectricityConsumer listener) {
		if (listener != null && !listeners.contains(listener)) {
			listeners.add(listener);
		}
	}

	public void removeElectricityListener(ElectricityConsumer listener) {
		if (listener != null && listeners.contains(listener)) {
			listeners.remove(listener);
		}
	}

	public void switchOn() {
		System.out.println("switcher is on");

		for (ElectricityConsumer ec : listeners) {
			ec.electricityOn(this);
		}

	}
}
