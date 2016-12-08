package HomeTask5;

import java.util.Arrays;

public class TaskNumber1 {
	public static void main(String[] args) {
		Customer[] customers = createCustomers();
		// call a method that creates an array containing 5 customer
		Arrays.sort(customers);// We sort it, using an interface comparable
		System.out.println("Buyers List in alphabetical order");
		for (int i = 0; i < customers.length; i++) {
			System.out.println(customers[i]);
		}
		System.out.println();

		System.out.println("Card number from 40000 to 60000");
		for (int i = 0; i < customers.length; i++) {
			if (customers[i].getNumber() > 40000 && customers[i].getNumber() < 60000) {
				System.out.println(customers[i]);
			}
		}
		System.out.println();
	}

	private static Customer[] createCustomers() {
		Customer customer1 = new Customer(40242, "Michael", "Minsk", 43523, 32422);
		Customer customer2 = new Customer(78542, "Paul", "Minsk", 76343, 45353);
		Customer customer3 = new Customer(35741, "Sebastian", "Homel", 45493, 43533);
		Customer customer4 = new Customer(45445, "Fillip", "Vitebsk", 56435, 65454);
		Customer customer5 = new Customer(92421, "Alain", "Brest", 87695, 43534);
		Customer[] customers = { customer1, customer2, customer3, customer4, customer5 };
		return customers;
	}
}
