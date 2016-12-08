package HomeTask2;

import java.util.Scanner;

public class TaskAddNumber6 {
	/*
	 * The program calculator able to add and divide in the console menu
	 */
	public static void main(String[] args) {
			double result = 0;
			Scanner number = new Scanner(System.in);
			System.out.println("Please enter number 1:");
			String symbol1 = number.nextLine();
			checkExit(symbol1);
			int n1 = Integer.valueOf(symbol1);
			System.out.println("Please enter number 2:");
			String symbol2 = number.nextLine();
			checkExit(symbol2);
			int n2 = Integer.valueOf(symbol2);
			System.out.println("Please enter symbol:");
			String func = number.next();
			checkExit(func);
			switch (func) {
			case "+":
				result = n1 + n2;
				break;
			case "/":
				result = n1 / n2;
				break;
			}
			System.out.println(result);
		number.close();
	}

	private static void checkExit(String symbol) {
		if ("q".equalsIgnoreCase(symbol)) {
			System.out.println("Programm closed");
			System.exit(0);
		}
	}
}