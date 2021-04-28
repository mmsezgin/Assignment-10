package assignment10_day25;

public class Q25_StringMerge {

	public static void main(String[] args) {
		// When gears merge and work together, one tooth from each one goes in order.
		// Write a method mergeStrings that will return the strings merged, one letter at a time, starting with one.
		// Please note one and two can be of different lengths. 
		
		System.out.println(mergeStrings("12345", "abcde"));
		
		System.out.println(mergeStrings("wooden", "spoon"));
		
		System.out.println(mergeStrings("java", "selenium"));

	}
	public static String mergeStrings(String str1, String str2) {
		
		String merge = "";
		
		if (str1.length() > str2.length()) {
			for (int i = 0; i < str2.length(); i++) {
				merge += "" + str1.charAt(i) + str2.charAt(i);
			}
			merge += str1.substring(str2.length());
		
		} else {
			for (int i = 0; i < str1.length(); i++) {
			merge += "" + str1.charAt(i) + str2.charAt(i);
			}
			merge += str2.substring(str1.length());
		}
						
			return merge;
	}

}

/*
 * Question-25

When gears merge and work together, one tooth from each one goes in order.
Write a method mergeStrings that will return the strings merged, one letter at a time, starting with one. Please note one and two can be of different lengths. Please look at below examples:

     s1 ==> "12345"
     s2 ==> "abcde"
     mergeStrings(s1,s2) ==> "1a2b3c4d5e"

     mergeStrings("wooden", "spoon") ==> "wsopoodoenn"

     mergeStrings("java", "selenium") ==> "jsaevlaenium"
     */
