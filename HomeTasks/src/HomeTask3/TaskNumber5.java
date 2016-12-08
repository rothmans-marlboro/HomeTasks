package HomeTask3;

public class TaskNumber5 {
	/*
	 * The program works by calculating the elements of the array to the first
	 * zero
	 */
	public static void main(String[] args) {
		int mass[] = { 1, 4, 0, 7, 2, 1, 3, 6, 9, 5 };
		int Composition = 1;
		for (int i = 0; i < mass.length; i++) {
			if (mass[i] == 0) {
				break;
			}
			Composition = Composition * mass[i];
		}
		System.out.println("Composition = " + Composition);
	}
}