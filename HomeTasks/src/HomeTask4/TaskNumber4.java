package HomeTask4;

public class TaskNumber4 {
	/*
	 * The algorithm determines whether all characters in the string are
	 * encountered once
	 */
	public static void main(String[] args) {
		String text = "my pen will not write";
		/*
		 * delete all spaces so that they were not considered and were not
		 * considered symbols
		 */
		text = text.replaceAll(" ", "");
		char mass[] = text.toCharArray();// create an array of characters
		int n = 0;
		for (int i = 0; i < mass.length; i++) {
			for (int j = 0; j < i; j++) {
				if (mass[i] == mass[j]) {
					n++;
				}
			}
		}
		if (n > 0) {
			System.out.println("Symbols occur in more than 1 times");
		} else {
			System.out.println("Symbols don't occur in more than 1 times");
		}
	}
}