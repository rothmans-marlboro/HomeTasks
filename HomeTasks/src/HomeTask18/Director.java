package HomeTask18;

public class Director {
	 
    public static Dinner construct(DinnerBuilder builder){
        builder.buildFirst();
        builder.buildMain();
        builder.buildDesert();
        return builder.getDinner();
    }
}