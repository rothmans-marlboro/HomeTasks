package by.pvt.coffee.entity;

public class GroundCoffee extends CoffeeInsolub {

	/**
     * 
     */
    private static final long serialVersionUID = 1L;

	private int timeTurk;

	public GroundCoffee(String name, int price, int weight, Taste taste, String country, int timeTurk) {
		super(name, price, weight, taste, country);
		this.timeTurk = timeTurk;
	}

	public int getTimeTurk() {
		return timeTurk;
	}

	public void setTimeTurk(int timeTurk) {
		this.timeTurk = timeTurk;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + timeTurk;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		GroundCoffee other = (GroundCoffee) obj;
		if (timeTurk != other.timeTurk)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "GroundCoffee [name=" + getName() + ", price=" + getPrice()
				+ ", weight=" + getWeight() + ", taste=" + getTaste() +
				", timeTurk=" + timeTurk + ", country=" + getCountry() +"]";
	}

}
