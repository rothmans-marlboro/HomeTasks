package HomeTask3;

public class TaskNumber2 {
	/*
	 * Program the largest and smallest values in an array
	 */
	public static void main(String[] args) {
		int mass[] = { 3, 4, 2, 7, 8, 1, 5, 6, 9, 5 };
		int maxValue = mass[0];
		for (int i = 0; i < mass.length; i++) {
			if (mass[i] > maxValue) {
				maxValue = mass[i];
			}
		}
		System.out.println("max value = " + maxValue);
		int minValue = mass[0];
		for (int i = 0; i < mass.length; i++) {
			if (mass[i] < minValue) {
				minValue = mass[i];
			}
		}
		System.out.println("min value = " + minValue);
	}
}