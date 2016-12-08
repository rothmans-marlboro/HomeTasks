package HomeTask2;

import java.util.Scanner;

public class TaskNumber7 {
	/*
	 * Requesting room program of the week
	 */
	public static void main(String[] args) {
		Scanner time = new Scanner(System.in);
		System.out.println("Enter day of the week");
		int number = time.nextInt();
		switch (number) {
		case 1:
			System.out.println("Monday");
			break;
		case 2:
			System.out.println("Tuesday");
			break;
		case 3:
			System.out.println("Wednesday");
			break;
		case 4:
			System.out.println("Thursday");
			break;
		case 5:
			System.out.println("Friday");
			break;
		case 6:
			System.out.println("Saturday");
			break;
		case 7:
			System.out.println("Sunday");
			break;
		default:
			System.out.println("You have entered a not right number");
		}
		time.close();
	}
}