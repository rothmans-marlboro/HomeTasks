package by.pvt.coffee.entity;

public class SublimatedCoffee extends CoffeeInstant {

	/**
     * 
     */
    private static final long serialVersionUID = 1L;

	private int time;

	public SublimatedCoffee(String name, int price, int weight, Taste taste, int dissolutionTime, int time) {
		super(name, price, weight, taste, dissolutionTime);
		this.time = time;
	}

	public int getTime() {
		return time;
	}

	public void setTime(int time) {
		this.time = time;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + time;
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
		SublimatedCoffee other = (SublimatedCoffee) obj;
		if (time != other.time)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "SublimatedCoffee [name=" + getName()
				+ ", price=" + getPrice() + ", weight=" + getWeight() + ", taste="
				+ getTaste() + ", time=" + time + ", dissolutionTime=" + getDissolutionTime() + "]";
	}
}