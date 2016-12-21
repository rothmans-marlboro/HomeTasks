package by.pvt.coffee.entity;

public class UngroundCoffee extends CoffeeInsolub {

	/**
     * 
     */
    private static final long serialVersionUID = 1L;

	private int diameterTurk;

	public UngroundCoffee(String name, int price, int weight, Taste taste, String country, int diameterTurk) {
		super(name, price, weight, taste, country);
		this.diameterTurk = diameterTurk;
	}

	public int getDiameterTurk() {
		return diameterTurk;
	}

	public void setDiameterTurk(int diameterTurk) {
		this.diameterTurk = diameterTurk;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + diameterTurk;
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
		UngroundCoffee other = (UngroundCoffee) obj;
		if (diameterTurk != other.diameterTurk)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "UngroundCoffee [name=" + getName() + ", price="
				+ getPrice() + ", weight=" + getWeight() + ", taste=" + getTaste() 
				+ ", diameterTurk=" + diameterTurk + ", country=" + getCountry() + "]";
	}

}
