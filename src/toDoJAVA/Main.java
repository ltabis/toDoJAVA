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
		if (args.length == 0 || (args.length == 1 &&
		("add".equals(args[0]	) == true || "remove".equals(args[0]) == true))) {
			FileData files = new FileData();
			files.showAll();
			return;
		} else if (args.length == 2 &&
		"add".equals(args[0]) == false && "remove".equals(args[0]) == false) {
			FileData files = new FileData();
			files.showCards(args[0]);
			return;
		}

		/* Special treatment */
		Add action = new Add();
		
		if ("add".equals(args[0]) == true && args.length == 2) {
			action.addList(args[1]);
			return;
		} else if ("remove".equals(args[0]) == true && args.length == 2) {
			action.removeList(args[1]);
			return;
		} else if ("add".equals(args[0]) == true && args.length == 3) {
			action.addCard(args[1], args[2]);
			System.out.println("Your card has been added to the list " + args[1]);
			return;
		}
		/*else if ("remove".equals(args[0]) == true && args.length == 3) {
			action.removeCard(args[1], args[2]);
			return;
		}*/
	}
}
