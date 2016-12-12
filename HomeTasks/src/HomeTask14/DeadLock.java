package HomeTask14;

public class DeadLock {
	//create two objects
	public final static Object one = new Object();
	public final static Object two = new Object();

	public static void main(String[] args) {
		Thread t1 = new Thread() {
			public void run() {
				synchronized (one) {//blocking the first object
					Thread.yield();
					synchronized (two) {//blocking the second object
						System.out.println("Success!");
					}
				}
			}
		};
		Thread t2 = new Thread() {
			public void run() {
				synchronized (two) {//blocking the second object
					Thread.yield();
					synchronized (one) {//blocking the first object
						System.out.println("Success!");
					}
				}
			}
		};
		t1.start();//run thread t1
		t2.start();//run thread t2
	}
}