package by.pvt.coffee.main;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.ResourceBundle;
import java.util.Scanner;


import by.pvt.coffee.comparator.CoffeeComparator;
import by.pvt.coffee.entity.Coffee;
import by.pvt.coffee.entity.GranuatedCoffee;
import by.pvt.coffee.entity.GroundCoffee;
import by.pvt.coffee.entity.PowderCoffee;
import by.pvt.coffee.entity.SublimatedCoffee;
import by.pvt.coffee.entity.Taste;
import by.pvt.coffee.entity.UngroundCoffee;
import by.pvt.coffee.exception.CoffeeException;

public class Main {
	
	private static final String FILENAME = "language/MessagesBundle";
	private static Locale locEN = new Locale("en", "EN");
	private static Locale locRU = new Locale("ru", "RU");
	private static ResourceBundle rb = ResourceBundle.getBundle(FILENAME, locEN);
	
	public static void main(String[] args) {
		GranuatedCoffee coffeeOne = new GranuatedCoffee("Jacobs", 20, 300, Taste.USUAL, 20, 2);
		GranuatedCoffee coffeeTwo = new GranuatedCoffee("Nescafe", 18, 400, Taste.SWEET, 22, 2);
		PowderCoffee coffeeThree = new PowderCoffee("Jardin", 17, 400, Taste.BITTER, 20, 1);
		PowderCoffee coffeeFour = new PowderCoffee("Jokey", 17, 350, Taste.BITTER, 25, 3);
		SublimatedCoffee coffeeFive = new SublimatedCoffee("Tchibo", 22, 300, Taste.USUAL, 25, 10);
		SublimatedCoffee coffeeSix = new SublimatedCoffee("Pele", 23, 350, Taste.USUAL, 25, 10);
		GroundCoffee coffeeSeven = new GroundCoffee("Colombo", 17, 400, Taste.SWEET, "Brazil", 5);
		GroundCoffee coffeeEigth = new GroundCoffee("Ambassador", 19, 350, Taste.BITTER, "Ethiopia", 5);
		UngroundCoffee coffeeNine = new UngroundCoffee("President", 24, 350, Taste.USUAL, "Ethiopia", 7);
		UngroundCoffee coffeeTen = new UngroundCoffee("Qesito", 23, 350, Taste.USUAL, "Colombia", 8);

		List<Coffee> coffeeList = new ArrayList<>();// create "coffeeList"
		// add arrays to "coffeeList"
		Collections.addAll(coffeeList, coffeeOne, coffeeTwo, coffeeThree, coffeeFour, coffeeFive, coffeeSix, coffeeSeven,
				coffeeEigth, coffeeNine, coffeeTen);
	
		Date currentDate = new Date();
		DateFormat df = DateFormat.getDateInstance(DateFormat.FULL,locEN);
		DateFormat tf = DateFormat.getTimeInstance(DateFormat.FULL,locEN);
		System.out.println(df.format(currentDate));
		System.out.println(tf.format(currentDate));
		
		for (int i=1; i<=6; i++){
			System.out.println(rb.getString("clue"+i));
		}

		boolean isStart = true;
		while (isStart){ // create cycle
			Scanner key = new Scanner(System.in);
			int enteredValue = key.nextInt();
			switch (enteredValue) {
			case 1: // we want to see the <List>
				coffeeList.clear(); // clear the List to show base List
				Collections.addAll(coffeeList, coffeeOne, coffeeTwo, coffeeThree, coffeeFour, coffeeFive, coffeeSix, coffeeSeven,
						coffeeEigth, coffeeNine, coffeeTen);
				System.out.println(rb.getString("clue7"));
				for (Coffee coffee : coffeeList) {
					System.out.println(coffee);
				}
				break;
			case 2:// we want to see the <Sorted List>
				System.out.println(rb.getString("clue8"));
				// sort coffeeList
				Collections.sort(coffeeList, new CoffeeComparator());
				for (Coffee coffee : coffeeList) {
					System.out.println(coffee);
				}
				break;
			case 3:// we want to choose coffee in terms of price and quality
				//enter two numbers to get array 
				Scanner litera = new Scanner(System.in);
				System.out.println(rb.getString("clue9"));
				int minPrice = litera.nextInt();
				System.out.println(rb.getString("clue10"));
				int maxPrice = litera.nextInt();
				System.out.println(rb.getString("clue11") + minPrice + " " + rb.getString("clue12") + maxPrice + ":");

				List<Coffee> coffeeWithPriceList = new ArrayList<>();
				for (Coffee coffee : coffeeList) { // condition corresponding to given range
					if (minPrice <= coffee.getPrice() && maxPrice >= coffee.getPrice()) {
						coffeeWithPriceList.add(coffee);
					}
				}
				
				if (coffeeWithPriceList.isEmpty()) {
					try { // create Exception if entered numbers didn't fall in the range
						throw new CoffeeException(rb.getString("clue13"));
					} catch (CoffeeException e) {
						e.printStackTrace();
					}
				}
				for (Coffee coffee : coffeeWithPriceList) {
					System.out.println(coffee);
				}
				break;
			case 4:// we want to serialize coffeeList
				try { // write to a file
					FileOutputStream fileOut = new FileOutputStream("coffeeList.txt");
					ObjectOutputStream out = new ObjectOutputStream(fileOut);
					out.writeObject(coffeeList);
					out.close();
					fileOut.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
				System.out.println(rb.getString("clue14"));
				try { // read from a file
					FileInputStream fileIn = new FileInputStream("coffeeList.txt");
					ObjectInputStream in = new ObjectInputStream(fileIn);				
					ArrayList<?> serializedList = (ArrayList<?>) in.readObject();
					for (Object coffee : serializedList) {
						System.out.println(coffee);
					}
					in.close();
					fileIn.close();
				} catch (Exception e) {
					e.printStackTrace();
				}
				break;
			case 5:
				if (locRU.equals(rb.getLocale())) {
                    rb = ResourceBundle.getBundle(FILENAME, locEN);
                } else {
                    rb = ResourceBundle.getBundle(FILENAME, locRU);
                }			
				for (int i=1; i<=6; i++){
					System.out.println(rb.getString("clue"+i));
				}
				break;
			case 6:// we want to exit
				System.out.println(rb.getString("clue15"));
				key.close();
				isStart = false;
				break;
			default: {
				System.out.println(rb.getString("clue16"));
			}
			}
		}
	}
}