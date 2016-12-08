package HomeTask4;

public class TaskNumber2 {
	public static void main(String[] args) {
		/*
		 * Removing all characters in the text except spaces that are not
		 * letters
		 */
		String text = "it is_10 o'clock";
		StringBuilder name = new StringBuilder();
		for (int i = 0; i < text.length(); i++) {
			if ((Character.isLetter(text.charAt(i))) || (Character.isSpaceChar(text.charAt(i)))) {
				name.append(text.charAt(i));
			}
			name.toString();
		}
		System.out.println(name);
	}
}