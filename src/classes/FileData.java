package classes;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.File;

/**
* @author lucas.tabis
* FileData.java
* Class to extract file data
*/

public class FileData {
	private File folder;
	private File[] listOfFiles;
	
	/* Constructors */
	public FileData(){
		folder = new File("./lists");
		listOfFiles = folder.listFiles();
	}
	public void getFileNames() {
		for (int i = 0; i < listOfFiles.length; i++) {
			System.out.println(listOfFiles[i].getName());
		}
	}
}
