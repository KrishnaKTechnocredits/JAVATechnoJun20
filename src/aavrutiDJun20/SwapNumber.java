//Swap two numbers without using third variable
package aavrutiDJun20;

public class SwapNumber {
	
	void swapNum(int num1,int num2) {
		System.out.println("Number Before Swap --> num1: " + num1 + "  num2: " + num2);
		num1 = num1+num2;
		num2 = num1-num2;
		num1 = num1-num2;		
		System.out.println("Number After Swap  --> num1: " + num1 + "  num2: " + num2);
	}	
	
	public static void main(String[] args) {
		SwapNumber swapNumber = new SwapNumber();		
		swapNumber.swapNum(10,20);	
	}
}