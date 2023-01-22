package properties;

import java.io.*;
import java.util.Properties;

public class PropertiesTest<T> {
	static String email = "email:aaa@bbb.ccc";
	static String name = "name=Vasya";
	static String size = "size 1";
	public static void main(String[] args) throws FileNotFoundException, IOException {
		File file = new File("prop.txt");
		file.createNewFile();
		
		try (PrintWriter pw = new PrintWriter(file);){
			pw.printf("%s;\n%s;\n%s;", email, name, size);
		} catch (Exception e) {
			e.printStackTrace();
		}

		Properties properties = new Properties();  //создаем объект Properties и загружаем в него данные из файла.
		properties.load(new FileReader(file));
		
		String emailRead = properties.getProperty("email"); //получаем значения свойств из объекта Properties
		String directoryRead = properties.getProperty("directory");
		
		System.out.printf("emailRead = %s directoryRead = %s;", emailRead, directoryRead);
		
		String getMail = properties.getProperty("email");
		System.out.println(getMail);
	}
}