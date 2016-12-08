package HomeTask2;

import java.util.Scanner;

public class TaskAddNumber1 {
	/*
	 * The program calculates the sum of the first n terms of the series
	 */
	public static void main(String[] args) {
		Scanner numberOne = new Scanner(System.in);
		System.out.println("Please enter number");
		int numberTwo = numberOne.nextInt();
		double sum = 0;
		for (int n = 1; n <= numberTwo; n++) {
			sum = (double) 1 / n + sum;
		}
		System.out.println(sum);
		numberOne.close();
	}
}