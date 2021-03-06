package madhuraMJun20.scannerClass;

/*Verify given String is palindrome or not. 
Input: radar
Output : Given string radar is palindrome.*/
public class PalindromeString {

	void findPalindrome(String input) {
		String newString = "";
		for (int i = input.length() - 1; i >= 0; i--) {
			newString += String.valueOf(input.charAt(i));     // output = output + input.charAt(index);
		}
		if (input.equals(newString))
			System.out.println("Given string " + input + " is a palindrome.");
		else
			System.out.println("Given string " + input + " is not a palindrome.");
	}

	public static void main(String[] args) {
		PalindromeString palindromeString = new PalindromeString();
		palindromeString.findPalindrome("radar");
		System.out.println();
		palindromeString.findPalindrome("technocredits");
	}
}