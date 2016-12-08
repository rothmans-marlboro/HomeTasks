package HomeTask4;

public class TaskNumber1 {
	public static void main(String[] args) {
		/*
		 * In the English text replace each letter appropriate to number in the
		 * alphabet
		 */
		String text = "my pen will not write";
		char mass[] = text.toCharArray();// create mass symbols from the text
		for (int i = 0; i < mass.length; i++) {
			if (mass[i] == ' ') {
				System.out.print("" + mass[i]);
			} else
				System.out.print(" " + mass[i] + " ");
		}
		System.out.println();
		char mass1[] = { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's',
				't', 'u', 'v', 'w', 'x', 'y', 'z' };
		System.out.println();
		for (int i = 0; i < mass.length; i++) {
			for (int j = 0; j < mass1.length; j++) {
				if (mass1[j] == mass[i]) {
					System.out.print(" " + j);
				}
			}
		}
	}
}
// I could't create that each figure was below the letter