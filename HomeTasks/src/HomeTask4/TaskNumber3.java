package HomeTask4;

import java.util.Arrays;

public class TaskNumber3 {
	/*
	 * From the text delete the words of a given length, starting at according
	 * to the letter
	 */
	public static void main(String[] args) {
		String text = "seeing is believing";
		char mass[] = { 'b', 'c', 'd', 'f', 'g', 'h', 'j', 'k', 'l', 'm', 'n', 'p', 'q', 'r', 's', 't', 'v', 'w', 'x',
				'z' };
		String part[] = text.split(" ");// break the text on text arrays
										// separated by spaces
		for (int i = 0; i < part.length; i++) {
			for (int j = 0; j < mass.length; j++) {
				/*
				 * condition: if the length of the text corresponds to the value
				 * and It begins with a consonant
				 */
				if (part[i].length() == 6 && part[i].startsWith(String.valueOf(mass[j]))) {
					part[i] = "";
				}
			}
		}
		String textNew = Arrays.toString(part);// create a new string
		System.out.println(textNew);
	}
}