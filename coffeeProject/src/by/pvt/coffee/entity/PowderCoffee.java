package by.pvt.coffee.entity;

public class PowderCoffee extends CoffeeInstant {

	/**
     * 
     */
    private static final long serialVersionUID = 1L;

	private int freeness;

	public PowderCoffee(String name, int price, int weight, Taste taste, int dissolutionTime, int freeness) {
		super(name, price, weight, taste, dissolutionTime);
		this.freeness = freeness;
	}

	public int getFreeness() {
		return freeness;
	}

	public void setFreeness(int freeness) {
		this.freeness = freeness;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + freeness;
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
		PowderCoffee other = (PowderCoffee) obj;
		if (freeness != other.freeness)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "PowderCoffee [name=" + getName()+ ", price=" + getPrice() + 
				", weight=" + getWeight() + ", taste=" + getTaste() 
				+ ", freeness=" + freeness + ", dissolutionTime=" + getDissolutionTime() + "]";
	}

}
