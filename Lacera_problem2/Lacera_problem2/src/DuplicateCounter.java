import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class DuplicateCounter {
	
	
	int wordCounter;
	HashMap<String, Integer> map;
	String word;

	public DuplicateCounter()
	{
	this.wordCounter = 0;
	this.map = new HashMap<>();
	}
	
	public void count(String dataFile) {
		
		 Scanner in = new Scanner(dataFile);
		 
		 try {
			 while(in.hasNextLine()) {
			in = new Scanner(new File(dataFile));
			 }
		} catch (FileNotFoundException e) {
			
			System.out.println("The file wasn't able to read, try again!");
		}
		 while(in.hasNextLine()) {	           
	           Integer wordCounter = map.get(word);
	           wordCounter += 1;
	           map.put(word, wordCounter);
	       }
		 in.close();	
	}

	public void write(String outputFile) {
		FileWriter writeOut;
		PrintWriter writeToFile;
		try {
			writeOut = new FileWriter(new File(outputFile));
			writeToFile = new PrintWriter(writeOut);
			for(Map.Entry<String, Integer> entry : map.entrySet())
			{
				writeToFile.write(entry.getKey() + "occurs " + entry.getValue() + " times" + "\n");
			}
			writeToFile.flush();
			writeOut.close();
			writeToFile.close();
		} catch (IOException ex) {
			System.out.println("The file wasn't able to print, try again!");
		}

	}
}

