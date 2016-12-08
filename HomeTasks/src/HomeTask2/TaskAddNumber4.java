package HomeTask2;

import java.util.Scanner;

public class TaskAddNumber4 {
	/*
	 * The program calculates the sum of the first n numbers
	 */
	public static void main(String[] args) {
		Scanner numberOne = new Scanner(System.in);
		System.out.println("Please enter number");
		int numberTwo = numberOne.nextInt();
		int sum = 0;
		int n;
		for (n = 1; n <= numberTwo; n++) {
			sum = sum + n;
		}
		System.out.println("Sum from 1 to " + (n - 1) + " inclusive = " + sum);
		numberOne.close();
	}
}