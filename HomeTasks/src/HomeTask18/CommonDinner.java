package HomeTask18;

public class CommonDinner extends DinnerBuilder {

	private Dinner dinner = new Dinner();

	// describe our methods
	@Override
	public void buildFirst() {
		dinner.Add("Cold dish");
	}

	@Override
	public void buildMain() {
		dinner.Add("Main dish");
	}

	@Override
	public void buildDesert() {
		dinner.Add("Dessert");
	}

	@Override
	public Dinner getDinner() {
		return dinner;
	}
}