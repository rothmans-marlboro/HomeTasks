package HomeTask18;

public class AddDinner extends DinnerBuilder {

	private Dinner dinner = new Dinner();

	// describe our methods
	@Override
	public void buildFirst() {
		dinner.Add("Cold dish");
		dinner.Add("Add cold dish");
	}

	@Override
	public void buildMain() {
		dinner.Add("Main dish");
		dinner.Add("Add main dish");
	}

	@Override
	public void buildDesert() {
		dinner.Add("Dessert");
		dinner.Add("Add dessert");
	}

	@Override
	public Dinner getDinner() {
		return dinner;
	}
}