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
		
	private int countLines(String listName) throws IOException {
		
		FileReader read = new FileReader("./lists/" + listName);
		BufferedReader buffer = new BufferedReader(read);
		int nbLines = 0;
		
		while (buffer.readLine() != null) nbLines++;
		
		buffer.close();
		return nbLines;
	}
	
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
	
	public void showAll() throws IOException {
		String[] fileLines;
		
		for (int i = 0; i < listOfFiles.length; i++) {
			fileLines = readFile(listOfFiles[i].getName());
			System.out.println("--- " + listOfFiles[i].getName());
			for (int j = 0; j < fileLines.length; j++)
				System.out.println("  + " + fileLines[j]);
		}
	}
}
