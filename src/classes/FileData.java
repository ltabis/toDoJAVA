package classes;
import java.io.IOException;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.File;

/**
* @author lucas.tabis
* FileData.java
* Class that will extract file data to get list and cards data
*/

public class FileData {
	private File folder;
	private File[] listOfFiles;
	
	/* Constructors */
	public FileData(){
		folder = new File("./lists");
		listOfFiles = folder.listFiles();
	}
	
	/* Counting lines inside of a file given as argument */
	
	private int countLines(String listName) throws IOException {
		
		FileReader read = new FileReader("./lists/" + listName);
		BufferedReader buffer = new BufferedReader(read);
		int nbLines = 0;
		
		while (buffer.readLine() != null) nbLines++;
		
		buffer.close();
		return nbLines;
	}
	
	/* Reading a file inside the lists folder given as argument */
	
	public String[] readFile(String ListName) throws IOException {

		FileReader read = new FileReader("./lists/" + ListName);
		BufferedReader buffer = new BufferedReader(read);
		int nbLines = countLines(ListName);
		String[] lines = new String[nbLines];
		
		for (int i = 0; i < nbLines; i++)
			lines[i] = buffer.readLine();
		
		buffer.close();
		return lines;
	}
	
	/* Show all the lists and their available content */
	
	public void showAll() throws IOException {
		
		String[] fileLines;
		
		for (int i = 0; i < listOfFiles.length; i++) {
			fileLines = readFile(listOfFiles[i].getName());
			System.out.println("\033[32m--- " + listOfFiles[i].getName() + "\033[0m");
			for (int j = 0; j < fileLines.length; j++)
				System.out.println("\033[34m  + \033[0m" + fileLines[j]);
		}
	}
	
	/* Show all the cards of a specific list */

	public void showCards(String arg) throws IOException {

		String[] fileLines;
		
		for (int i = 0; i < listOfFiles.length; i++) {
			if (listOfFiles[i].getName().equals(arg)) {
				fileLines = readFile(listOfFiles[i].getName());
				System.out.println("\033[32m--- " + listOfFiles[i].getName() + "\033[0m");
				for (int j = 0; j < fileLines.length; j++)
					System.out.println("\033[34m  + \033[0m" + fileLines[j]);
				return;
			}
		}
		System.out.println("Sorry, but the list " + arg + " does not exists");
	}
}
