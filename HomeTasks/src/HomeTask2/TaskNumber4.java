package HomeTask2;

import java.util.Scanner;

public class TaskNumber4 {

	/*
	 * The program determines whether a leap year
	 */
	public static void main(String[] args) {
		Scanner time = new Scanner(System.in);
		System.out.println("Enter an year");
		int year = time.nextInt();
		if (year % 4 == 0) {
			System.out.println("leap year");
		} else {
			System.out.println("not a leap year");
		}
		time.close();
	}
}