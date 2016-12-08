package HomeTask5;

class Customer implements Comparable<Customer> {
	private int id;
	private String name;
	private String adress;
	private int number;
	private int number2;

	public Customer(int id, String name, String adress, int number, int number2) {
		super();
		this.id = id;
		this.name = name;
		this.adress = adress;
		this.number = number;
		this.number2 = number2;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAdress() {
		return adress;
	}

	public void setAdress(String adress) {
		this.adress = adress;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public int getNumber2() {
		return number2;
	}

	public void setNumber2(int number2) {
		this.number2 = number2;
	}

	@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + ", adress=" + adress + ", number=" + number + ", number2="
				+ number2 + "]";
	}

	@Override
	public int compareTo(Customer o) {// method, which compares the customer by name
		return this.getName().compareTo(o.getName());
	}
}