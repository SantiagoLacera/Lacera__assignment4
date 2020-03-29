
public class Application {

	public static void main(String[] args) {

		DuplicateCounter DuplicateCounter = new DuplicateCounter();

		String DataFile = "problem2.txt";
		String OutputFile = "unique_word_counts.txt";

		DuplicateCounter.count(DataFile);
		DuplicateCounter.write(OutputFile);

	}

}
