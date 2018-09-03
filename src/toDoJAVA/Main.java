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
		
		/* Displaying all informations on all lists and cards inside the list folder*/
		if (args.length == 1 || (args.length == 2 &&
		("add".equals(args[1]) == true || "remove".equals(args[1]) == true))) {
			FileData files = new FileData();
			files.showAll();
			return;
		} else if (args.length == 2 &&
		"add".equals(args[1]) == false && "remove".equals(args[1]) == false) {
			FileData files = new FileData();
			files.showCards(args[1]);
			return;
		}

		/* Special treatment */
		Add action = new Add();
		
		if ("add".equals(args[1]) == true && args.length == 3) {
			action.addList(args[2]);
			return;
		} else if ("remove".equals(args[1]) == true && args.length == 3) {
			action.removeList(args[2]);
			return;
		} else if ("add".equals(args[1]) == true && args.length == 4) {
			action.addCard(args[2], args[3]);
			return;
		} else if ("remove".equals(args[1]) == true && args.length == 4) {
			action.removeCard(args[2], args[3]);
			return;
		}


	}
}
