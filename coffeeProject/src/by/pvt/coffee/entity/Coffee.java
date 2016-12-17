package by.pvt.coffee.entity;

import java.io.Serializable;

public class Coffee implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String name;
	private int price;
	private int weight;
	private Taste taste;

	public Coffee(String name, int price, int weight, Taste taste) {
		super();
		this.name = name;
		this.price = price;
		this.weight = weight;
		this.taste = taste;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public Taste getTaste() {
		return taste;
	}

	public void setTaste(Taste taste) {
		this.taste = taste;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + price;
		result = prime * result + ((taste == null) ? 0 : taste.hashCode());
		result = prime * result + weight;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Coffee other = (Coffee) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (price != other.price)
			return false;
		if (taste != other.taste)
			return false;
		if (weight != other.weight)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Coffee [name=" + name + ", price=" + price + ", weight=" + weight + ", taste=" + taste + "]";
	}
}