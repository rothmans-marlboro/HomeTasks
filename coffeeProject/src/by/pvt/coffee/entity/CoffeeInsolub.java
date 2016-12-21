package by.pvt.coffee.entity;

public class CoffeeInsolub extends Coffee {

	/**
     * 
     */
    private static final long serialVersionUID = 1L;

	private String country;

	public CoffeeInsolub(String name, int price, int weight, Taste taste, String country) {
		super(name, price, weight, taste);
		this.country = country;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((country == null) ? 0 : country.hashCode());
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
		CoffeeInsolub other = (CoffeeInsolub) obj;
		if (country == null) {
			if (other.country != null)
				return false;
		} else if (!country.equals(other.country))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "CoffeeInsolub [name=" + getName() + ", price=" + getPrice() + ", weight=" + getWeight()
				+ ", taste=" + getTaste() + "country=" + country + "]";
	}

}
