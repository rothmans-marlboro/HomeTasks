package HomeTask2;

import java.util.Scanner;

public class TaskNumber5 {
	/*
	 * The program determines the optimal weight
	 */
	public static void main(String[] args) {
		Scanner time = new Scanner(System.in);
		System.out.println("Enter your height");
		int height = time.nextInt();
		System.out.println("Enter your weight");
		int weight = time.nextInt();
		int optimalWeigth = height - 100;
		if (weight < optimalWeigth) {
			System.out.println("You have a normal weight");
		} else {
			System.out.println("You need to lose weight");
		}
		time.close();
	}
}