package swapnaWJun20;

import java.util.InputMismatchException;
import java.util.Scanner;

public class SumExceptionHandling {

	int getSumThreeNos() {
		int numbers = 0;
		int sum = 0;
		int count = 0;

		Scanner sc = new Scanner(System.in);
		System.out.println("How many numbers you want to add : ");
		int totalNo = sc.nextInt();
		while (count < totalNo) {
			try {
				System.out.println("\nEnter the number at " + (count + 1) + " to add : ");
				numbers = sc.nextInt();
				sum += numbers;
				count++;
			} catch (InputMismatchException ie) { //
				System.out.println("Invalid input provided, Please add numbers only");
				sc.nextLine();
			}
		}
		System.out.println("Total sum of user given numbers is : " + sum);
		sc.close();
		return sum;
	}

	public static void main(String[] args) {
		new SumExceptionHandling().getSumThreeNos();
	}
}