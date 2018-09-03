package classes;
import java.io.File;
import java.io.IOException;

/**
 * @author lucas.tabis
 * Add.java
 * Add content to the current folder
 */

public class Add {

	/* Constructor(s) */
	public Add(){}
	
	/* Add a list to the lists folder */
	
	public void addList(String listName) throws IOException {
		
		File file = new File("./lists/" + listName);
		
		if (file.createNewFile()){
		  System.out.println("New list " + file.getName() + " has been created");
		} else {
		  System.out.println("The list " + file.getName() + " already exists");
		}
	}

	/* Add a card to a given list */
	
	public void addCard(String listName) throws IOException {
		
		File file = new File("./lists/" + listName);
	}
	
	/* Remove a list from the lists folder */
	
	public void removeList(String listName) throws IOException {
		
		File file = new File("./lists/" + listName);
		
		if (file.delete()){
		  System.out.println("New list " + file.getName() + " has been deleted");
		} else {
		  System.out.println("The list " + file.getName() + " does not exists");
		}
	}

	/* Remove a card to a given list */
	
	public void removeCard(String listName) throws IOException {
		
		File file = new File("./lists/" + listName);
	}
}