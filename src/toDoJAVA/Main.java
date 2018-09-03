package toDoJAVA;
import java.io.IOException;
import classes.Add;
import classes.FileData;

/**
 * @author lucas.tabis
 * Main.java
 * Main file
 */

public class Main {

	public static void main(String[] args) throws IOException {
		if (args.length == 1 || (args.length == 2 &&
		("add".equals(args[1]) == true || "remove".equals(args[1]) == true))) {
			displayAllLists();
			return;
		}
		if ("add".equals(args[1]) == true) {
			System.out.println("Add function");
			Add adding = new Add();
			adding.addList(args[2]);
			return;
		} else if ("remove".equals(args[1]) == true)
			System.out.println("Remove function");
		FileData files = new FileData();
		files.getFileNames();
		String[] str = files.readFile("exemple.txt");
		
		for (int i = 0; i < str.length; i++) {
			System.out.println(str[i]);
		}
	}
	
	public static void displayAllLists() {
		System.out.println("lists");		
	}
}
