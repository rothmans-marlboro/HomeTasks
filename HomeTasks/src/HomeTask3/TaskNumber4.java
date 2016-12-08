package HomeTask3;

public class TaskNumber4 {
	/*
	 * The program is finding the minimum number of values in an array
	 */
	public static void main(String[] args) {
		int mass[] = { -1, 4, 0, 7, -2, 1, -3, 6, 9, 5 };
		int sum = 0;
		for (int i = 0; i < mass.length; i++) {
			if (mass[i] < 0) {
				sum = sum + 1;
			}
		}
		System.out.println("Amount of negative elements = " + sum);
	}
}