package by.pvt.coffee.entity;

public class CoffeeInstant extends Coffee {

	/**
     * 
     */
    private static final long serialVersionUID = 1L;

	private int dissolutionTime;

	public CoffeeInstant(String name, int price, int weight, Taste taste, int dissolutionTime) {
		super(name, price, weight, taste);
		this.dissolutionTime = dissolutionTime;
	}

	public int getDissolutionTime() {
		return dissolutionTime;
	}

	public void setDissolutionTime(int dissolutionTime) {
		this.dissolutionTime = dissolutionTime;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + dissolutionTime;
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
		CoffeeInstant other = (CoffeeInstant) obj;
		if (dissolutionTime != other.dissolutionTime)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "CoffeeInstant [dissolutionTime=" + dissolutionTime + ", name=" + getName() + ", price=" + getPrice() + ", weight="
				+ getWeight() + ", taste=" + getTaste() + "dissolutionTime=" + dissolutionTime+"]";
	}

}
