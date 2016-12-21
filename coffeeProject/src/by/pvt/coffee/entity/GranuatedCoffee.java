package by.pvt.coffee.entity;

public class GranuatedCoffee extends CoffeeInstant {

	/**
     * 
     */
    private static final long serialVersionUID = 1L;

	private int diameter;

	public GranuatedCoffee(String name, int price, int weight, Taste taste, int dissolutionTime, int diameter) {
		super(name, price, weight, taste, dissolutionTime);
		this.diameter = diameter;
	}

	public int getDiameter() {
		return diameter;
	}

	public void setDiameter(int diameter) {
		this.diameter = diameter;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + diameter;
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
		GranuatedCoffee other = (GranuatedCoffee) obj;
		if (diameter != other.diameter)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "GranuatedCoffee [name=" + getName()
				+ ", price=" + getPrice() + ", weight=" + getWeight() + 
				", taste=" + getTaste() + ", diameter=" + diameter + ", dissolutionTime=" + getDissolutionTime() + "]";
	}

}
