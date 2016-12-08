package HomeTask14;

public class ThreadOne implements Runnable {
	String thrdName;

	ThreadOne(String name) {
		thrdName = name;
	}

	public void run() { //it will be performed in the streams
		for (int i = 0; i < 10; i++) {
			System.out.print(thrdName);
			for (int j = 1; j <= 10; j++) {
				System.out.print(i * 10 + j + " ");
			}
			System.out.println();
		}
	}
}