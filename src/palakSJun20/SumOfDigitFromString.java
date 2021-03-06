/*To convert char to Integer.
Points to be remember:
1) String can be converted to int but there is no direct method to convert char to int
2) char has to be coverted first to string and then to interger.
String input = "1Hh9PR34QP";
Hint : 1+9+3+4 [all digits]
output : 17
 * */
package palakSJun20;

public class SumOfDigitFromString {
	
	void findSumOfDigit(String string){
		int sum = 0;
		for (int i = 0; i < string.length(); i++) {
			if (Character.isDigit(string.charAt(i))) {
				 String input = string.valueOf(string.charAt(i));
				 int  digit = Integer.parseInt(input);
				 sum = sum + digit;
			}	
		}
		 System.out.println("Sum of Digit is : " +sum);	 
	}
	

	public static void main(String[] args) {
		String string = "1Hh9PR34QP";
		SumOfDigitFromString sumOfDigitFromString = new SumOfDigitFromString();
		System.out.println("Input : "+string);
		sumOfDigitFromString.findSumOfDigit(string);
		

	}

}
