package assignment10_day25;

public class Q18_SeparatorWord {

	public static void main(String[] args) {
		
		System.out.println("Input: Word, X, 3");
		System.out.println("Output: " + returnBig("Word", "X", 3));
		
		System.out.println("Input: This, And, 2");
		System.out.println("Output: " + returnBig("This", "And", 2));
		
		System.out.println("Input: This, And, 1");
		System.out.println("Output: " + returnBig("This", "And", 1));
		

	}
	public static String returnBig(String word, String sep, int times) {
		String big = word;
		
		for(int i = 1; i < times; i++) {
			big += sep+word;
		}
		
		
		return big;
		
	}
}

/*
Question-18

Given two strings, word and a separator sep, return a big string made of count occurrences of the word, separated by the separator string.

Sample Output:

     input: Word
     input: X
     input: 3
     output: WordXWordXWord

     input: This
     input: And
     input: 2
     output: ThisAndThis

     input: This
     input: And
     input: 1
     output: This
     */