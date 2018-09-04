package classes;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
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
	
	public void addCard(String listName, String cardDescription) throws IOException {
		
		int i = 0;
		String lastLine = null;
		String id = null;
		FileWriter write = new FileWriter("./lists/" + listName, true);
		FileReader read = new FileReader("./lists/" + listName);
		BufferedReader lastBuffer = new BufferedReader(read);
		BufferedReader buffer = new BufferedReader(read);
		
		for (; buffer.readLine() != null;)
			lastLine = lastBuffer.readLine();
		for (; lastLine != null && lastLine.charAt(i) != ':' && i < lastLine.length(); i++)
			id += lastLine.charAt(i);
		if (lastLine == null || i == lastLine.length()) {
			write.write("1 : " + cardDescription);
			buffer.close();
			lastBuffer.close();
			write.close();
			return;
		}
		write.write(Integer.parseInt(id) + 1 + " : " + cardDescription);
		buffer.close();
		lastBuffer.close();
		write.close();
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
		
		String id = null;
		FileReader read = new FileReader("./lists/" + listName);
		BufferedReader buffer = new BufferedReader(read);
		
		for (String str; (str = buffer.readLine()) != null;) {
			for (int i = 0; str.charAt(i) != ':'; i++)
				id += str.charAt(i);
			// if (id.equals())
		}
		
		buffer.close();
	}
}