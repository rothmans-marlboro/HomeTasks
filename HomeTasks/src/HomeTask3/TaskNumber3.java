package HomeTask3;

public class TaskNumber3 {
	/*
	 * Program find a minimum value of the array and its index
	 */
	public static void main(String[] args) {
		int mass[] = { 3, 4, 2, 7, 8, 1, 5, 6, 9, 5 };
		int minValue = mass[0];
		int i = 0;
		int number = -1;
		for (i = 0; i < mass.length; i++) {
			if (mass[i] < minValue) {
				minValue = mass[i];
				number = i;
			}
		}
		System.out.println("Minimum meaning = " + minValue + ". His index " + number);
	}
}