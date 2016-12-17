package by.pvt.coffee.comparator;

import java.util.Comparator;

import by.pvt.coffee.entity.Coffee;

public class CoffeeComparator implements Comparator<Coffee> {

	@Override
    public int compare(Coffee o1, Coffee o2) {
        float one = (float) o1.getPrice() / o1.getWeight();
        float two = (float) o2.getPrice() / o2.getWeight();
        if (one == two) {
            return 0;
        }
        if (one - two > 0) {
            return 1;
        } else {
            return -1;
        }
    }
}