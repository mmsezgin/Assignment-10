package assignment10_day25;

public class Q31_IsPalindrome {

	public static void main(String[] args) {

		System.out.println(isPalindrome("Noon"));
		
		System.out.println(isPalindrome("I am not palindrome"));
		
		System.out.println(isPalindrome("wooden"));
		
		System.out.println(isPalindrome("Nurses Run"));
		
	}
	public static boolean isPalindrome(String str) {
		str = str.replace(" ", "");
		String dummy = "";
		for (int i = str.length(); i > 0; i--) {
			dummy += str.charAt(i-1);
		}
		
		return (str.equalsIgnoreCase(dummy));
	}
}

/*
 * Question-31

Palindrome is a word, phrase, or sequence that reads the same backward as forward, e.g., madam or nurses run.

So method isPalindrome checks that and returns true if check is palindrome and false if it is not.

- make your conditions case insensitive. ex: Civic and civic are both palindromes
- make your conditions space insensitive. Race car is a palindrome even though there is space in between.

Sample Output:

     isPalindrome("Noon") ==> true

     isPalindrome("I am not palindrome") ==> false

     isPalindrome("wooden") ==> false

     isPalindrome("Nurses Run") ==> true
     */
