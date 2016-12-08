package HomeTask4;

public class TaskNumber5 {
	/*
	 * For the two strings to create a method that determines whether the line
	 * is another permutation
	 */
	public static void main(String[] args) {
		String s1 = "Hello";
		String s2 = "olleH";
		System.out.println(check(s1, s2));
	}

	/*
	 * Create a method, reversing the string. If the string matches, then it
	 * outputs the value is true, if there is no - false
	 */
	public static boolean check(String s1, String s2) {
		String reversedS1 = new StringBuilder(s1).reverse().toString();
		return reversedS1.equals(s2);
	}
}