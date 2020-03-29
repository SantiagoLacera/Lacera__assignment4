import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class DuplicateRemover {

	private Set<String> uniqueWords;
	

	public void remove(String dataFile) {
		  uniqueWords = new HashSet<>();
	

		try {
			Scanner in = new Scanner(new File(dataFile));
			while (in.hasNextLine()) {			
					uniqueWords.add(in.nextLine());
			}

			
		} catch (FileNotFoundException e) {
			System.out.println("The file wasn't processed, try again!");
		}

	}

	public void write(String outputFile) {
		

		try {
			PrintWriter output = new PrintWriter(outputFile);
			for (String words : uniqueWords) {

				output.println(words);
			}
			output.flush();
			output.close();

		} catch (FileNotFoundException e) {
			System.out.println("The output wasn't processed, try again!");
		}

	}

}

