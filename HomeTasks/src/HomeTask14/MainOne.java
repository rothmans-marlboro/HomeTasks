package HomeTask14;

import java.util.Scanner;

//the application that uses two threads
public class MainOne {
	private static Scanner meaning;

	public static void main(String[] args) {
		System.out.println("If you want to start a programm write <start>");
		boolean isStart = true; // create infinity cycle
		while (isStart) { 	
			meaning = new Scanner(System.in);
			String text = meaning.nextLine();
			if (text.equals("start")) { // compare the strings
				ThreadOne one = new ThreadOne("Thread 1:");// create two threads
				ThreadOne two = new ThreadOne("Thread 2:");
				Thread newThrd1 = new Thread(one);
				Thread newThrd2 = new Thread(two);
				newThrd1.start(); //start the threads
				newThrd2.start();
				isStart = false;
			} else {
				System.out.println("Please enter again");
			}	
		}
	}
}