package HomeTask15;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Main {

	public static void main(String[] args) {
		// create pool to do three thread simultaneous
		ExecutorService pool = Executors.newFixedThreadPool(3);

		List<Client> clients = new ArrayList<Client>();// create client's List
		clients.add(new Client("Vasia"));
		clients.add(new Client("Tom"));
		clients.add(new Client("Mark"));
		clients.add(new Client("Michael"));
		clients.add(new Client("Alain"));
		clients.add(new Client("Bruno"));
		clients.add(new Client("Filippe"));
		clients.add(new Client("Jenson"));
		clients.add(new Client("Nico"));
		clients.add(new Client("Kimi"));

		for (Client client : clients) {
			pool.submit(client);// queue on implementing
		}

		pool.shutdown();// finish thread
		try {
			pool.awaitTermination(1, TimeUnit.MINUTES);
		} catch (InterruptedException e) {
			e.printStackTrace();
			pool.shutdownNow();
		}
	}
}