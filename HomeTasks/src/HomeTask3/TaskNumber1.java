package HomeTask3;

public class TaskNumber1 {
	/*
	 * The program output array of values on the screen and calculating the mean
	 * arithmetic mean
	 */
	public static void main(String[] args) {
		float mass[] = { 3.1F, 4.5F, 2.1F, 7.4F, 8.9F, 1.7F, 5.4F, 6.2F, 9.5F, 5.5F };
		for (int i = 0; i < mass.length; i++) {
			System.out.println("Meaning " + i + " is " + mass[i]);
		}
		float sum = 0;
		for (int i = 0; i < mass.length; i++) {
			sum = sum + mass[i];
		}
		double averageValue = sum / 10;
		System.out.println("average value= " + averageValue);
	}
}