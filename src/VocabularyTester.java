public class VocabularyTester {
    public static void main(String[] args) {
	
	/* REPLACE THIS WITH YOUR PROGRAM */
	
	if (args.length != 1) {
	    System.out.println("Error: received " + args.length +
			       " arguments, expected 1.\n" +
			       "Vocabulary Tester example usage:\n" +
			       "  java VocabularyTeser file-name.txt\n" +
			       "will print the first 10 words in \"file-name.txt\"");
			       
	}

	WordReader wr = new WordReader(args[0]);

	System.out.println("The first 10 words of " + args[0] + " are: ");

	for (int i = 0; i < 10; i++) {
	    System.out.println(wr.nextWord());
	}
    }
}
