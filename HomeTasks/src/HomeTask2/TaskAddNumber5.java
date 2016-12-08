package HomeTask2;

public class TaskAddNumber5 {
	/*
	 * The program which eliminates the function value
	 */
	public static void main(String[] args) {
		for (double i = -4; i <= 4; i += 0.5) {
			double yFanction = 2 * (Math.pow(i, 2)) - 5 * i - 8;
			System.out.println("i=" + i + " y=" + yFanction);
		}
	}
}