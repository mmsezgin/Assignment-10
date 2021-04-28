package assignment10_day25;

public class Q19_HaveJavaTimes {

	public static void main(String[] args) {
		// Return the number of times that the string "java" appears anywhere in the given string word.
		
		System.out.println("Input:  javaxjava");
		System.out.println("Output: " + countJava("javaxjava"));
		
		System.out.println("Input:  javaxjavaapplepearjavaegg");
		System.out.println("Output: " + countJava("javaxjavaapplepearjavaegg"));

	}
	
	public static int countJava(String str) {
		
		
		str = str.toLowerCase();
		int count = 0;
		int nextJ = str.indexOf("java");
		
		while (nextJ != -1) {
			count++;
			nextJ = str.indexOf("java", nextJ + 1);
		}
		
		return count;
	}

}
