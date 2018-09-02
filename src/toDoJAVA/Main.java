package toDoJAVA;
import java.io.IOException;

import classes.FileData;

/**
 * @author lucas.tabis
 * Main.java
 * Main file
 */

public class Main {

	public static void main(String[] args) throws IOException {
		if ("add".equals(args[0]) == true)
			System.out.println("Add function");
		if ("add".equals(args[0]) == true)
			System.out.println("Add function");
		else
			System.out.println("Display");
		FileData files = new FileData();
		files.getFileNames();
		String[] str = files.readFile("exemple.txt", "list1");
		
		for (int i = 0; i < str.length; i++) {
			System.out.println(str[i]);
		}
	}
}
