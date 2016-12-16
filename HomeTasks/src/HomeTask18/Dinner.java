package HomeTask18;

import java.util.ArrayList;

public class Dinner {
    //create ArrayList with our dinner
    private final ArrayList<String> dinner = new ArrayList<>();
    
    public void Add(String food){
        dinner.add(food);
    }
    
    public void show(){
        for (String menu: dinner){
            System.out.println(menu);
        }
    }
}