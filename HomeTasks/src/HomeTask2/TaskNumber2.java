package HomeTask2;

import java.util.Scanner;

public class TaskNumber2 {
	/*
	 * The program compares two numbers entered from the keyboard
	 */
	public static void main(String[] args) {
		Scanner number = new Scanner(System.in);
		System.out.println("Please enter two numbers");
		int num1 = number.nextInt();
		int num2 = number.nextInt();
		if (num1 > num2) {
			System.out.println("The number " + num1 + " more than the number " + num2);
		} else {
			System.out.println("The number " + num2 + " more than the number " + num1);
		}
		number.close();
	}
}