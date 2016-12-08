package HomeTask2;

import java.util.Scanner;

public class TaskNumber6 {
	/*
	 * The program logs the correct ending of the word "ruble", depending on the
	 * number entered
	 */
	public static void main(String[] args) {
		Scanner time = new Scanner(System.in);
		System.out.println("Enter number from 0 to 999");
		int number = time.nextInt();
		if (number > 100) {
			number = number % 100;
		}
		if (number > 15) {
			number = number % 10;
		}
		switch (number) {
		case 1:
			System.out.println("rubl");
			break;
		case 2:
			System.out.println("rublia");
			break;
		case 3:
			System.out.println("rublia");
			break;
		case 4:
			System.out.println("rublia");
			break;
		default:
			System.out.println("rublei");
		}
		time.close();
	}
}