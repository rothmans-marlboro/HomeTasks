package HomeTask2;

public class TaskNumber1 {
	/*
	 * The program is finding the number of characters in the text and dividing
	 * it into 2 equal parts
	 */
	public static void main(String[] args) {
		String text = "Memento mori";
		System.out.println("The number of characters in the text: " + text.length());
		int mid = text.length() / 2;
		String part[] = { text.substring(0, mid), text.substring(mid), };
		System.out.println(part[0]);
		System.out.println(part[1]);
	}
}