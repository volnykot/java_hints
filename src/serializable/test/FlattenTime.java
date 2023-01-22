package serializable.test;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class FlattenTime {
	public static void main(String[] args) {
		String filename = "time.ser";
		if (args.length > 0) {
			filename = args[0];
		}
		PersistentTime time = new PersistentTime();

		try (
			FileOutputStream fos = new FileOutputStream(filename);
			ObjectOutputStream out = new ObjectOutputStream(fos);
		) {
			out.writeObject(time);
		} catch (IOException ex) {
			ex.printStackTrace();
		}
	}
}