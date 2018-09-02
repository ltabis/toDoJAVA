package toDoJAVA;
import classes.FileData;

/**
 * @author lucas.tabis
 * Main.java
 * Main file
 */

public class Main {

	public static void main(String[] args) {
		if ("add".equals(args[0]) == true)
			System.out.println("Add function");
		if ("add".equals(args[0]) == true)
			System.out.println("Add function");
		else
			System.out.println("Display");
		FileData files = new FileData();
		files.getFileNames();
	}
}
