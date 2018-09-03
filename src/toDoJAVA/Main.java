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
			FileData files = new FileData();
			files.showAll();
			return;
		}

		Add action = new Add();
		
		if ("add".equals(args[1]) == true && args.length == 3) {
			action.addList(args[2]);
			return;
		} else if ("remove".equals(args[1]) == true && args.length == 3) {
			action.removeList(args[2]);
			return;
		}
	}
}
