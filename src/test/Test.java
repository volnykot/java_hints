package test;

import java.io.File;
import java.io.IOException;
import java.nio.file.*;

public class Test {
	static String fold = ".//fold";
	static String name = "text.txt";
	
	Path path = Paths.get(fold, name);
	
	File dirFile = new File(fold);
	File txtFile = new File(name);
	File fileInDir = new File(fold, name);
	
	
	public static void main(String[] args) throws Exception {
		doa();
	}

	private static void doa() {
boolean tmp = Files.exists(Paths.get(fold, name));
		
		String logText = tmp ? "repo file in folder exists" : "repo file in folder does not exist";
		System.out.println(logText);
		
		if (!tmp) {
			logText = new File (fold).mkdir() ? "repo folder created" : "repo folder was not created";
			System.out.println(logText);
			try {
				logText = new File (fold, name).createNewFile() ? "repo txt created" : "repo txt was not created";
				System.out.println(logText);
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	}
}
