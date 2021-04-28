package assignment10_day25;

public class Q26_ReturnUniqueChars {

	public static void main(String[] args) {
		// uniqueChars is a method that you will code now, should be able to accept any string in the word 
		// and return unique characters from the parameter.
		
		System.out.println(uniqueChars("java"));
		
		System.out.println(uniqueChars("mama"));
		
		System.out.println(uniqueChars("spoon"));

	}
	public static String uniqueChars(String str) {
		
		String uniqueChar = "";
		
		
		for (int i = 0; i < str.length(); i++) {
			if (!uniqueChar.contains(str.substring(i, i + 1))) {
				uniqueChar += str.substring(i, i + 1);
			}
		}
		
		return uniqueChar;
	}

}

/*
Question-26

uniqueChars is a method that you will code now, should be able to accept any string in the word and return unique characters from the parameter.

Sample Output:

     uniqueChars("java") ==> "jav"

     uniqueChars("mama") ==> "ma"

     uniqueChars("spoon") ==> "spon"
     */