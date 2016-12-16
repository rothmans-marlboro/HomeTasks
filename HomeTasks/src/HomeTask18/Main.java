package HomeTask18;
  
public class Main {
 
    public static void main(String[] args) {
        DinnerBuilder dinner = new CommonDinner();
        DinnerBuilder addDinner = new AddDinner();
        Dinner stDin1 = Director.construct(dinner);
        Dinner stDin2 = Director.construct(addDinner);
        stDin1.show();//write menu if we want to order common dinner
        stDin2.show();//write menu if we want to order add dinner
    }
}