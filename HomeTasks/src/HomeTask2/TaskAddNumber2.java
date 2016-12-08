package HomeTask2;

import java.util.Scanner;

public class TaskAddNumber2 {

	/*
	 * The Programm computes the factorial of a number
	 * 
	 */
	public static void main(String[] args) {
		Scanner numberOne = new Scanner(System.in);
		System.out.println("Please enter number");
		int numberTwo = numberOne.nextInt();
		int i = 1;
		int factorial = 1;
		for (i = 1; i <= numberTwo; i++) {
			factorial = factorial * i;
		}
		System.out.println("factorial=" + factorial);
		numberOne.close();
	}
}