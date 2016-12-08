package HomeTask3;

public class TaskNumber6 {
	/*
	 * Program an array of zeros permutation
	 */
	public static void main(String[] args) {
		int mass[] = { 1, 4, 0, 7, 2, 1, 3, 6, 9, 5 };
		for (int i = 0; i < mass.length; i++) {
			if (mass[i] == 0) {
				for (int j = (i + 1); j < mass.length; j++) {
					if (mass[j] != 0) {
						int number = mass[i];
						mass[i] = mass[j];
						mass[j] = number;
						break;
					}
				}
			}
			System.out.print(mass[i] + " ");
		}
	}
}