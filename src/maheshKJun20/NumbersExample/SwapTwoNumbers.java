package maheshKJun20.NumbersExample;

public class SwapTwoNumbers {
	
	void displayValueAfterSwapping(int num1, int num2) {
		System.out.println("input: num1= " + num1 + ", num2 = " + num2);
		num1 = num1 + num2;
		num2 = num1 - num2;
		num1 = num1 - num2;
		System.out.println("output: num1= " + num1 + ", num2 = " + num2);
	}
	
	public static void main(String[] args) {
		SwapTwoNumbers swapTwoNumbers = new SwapTwoNumbers();
		swapTwoNumbers.displayValueAfterSwapping(10, 20);
	}

}
