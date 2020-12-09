

public class DishTools {
    public static final int AVERAGE_COST_OF_DISH_IN_CENTS = 1300;

    public static void shoutDishName(String name){

        System.out.println(name.toUpperCase());
    }

    public static void analyzeDishCost(int price){
        if(price >AVERAGE_COST_OF_DISH_IN_CENTS){
            System.out.println("More expensive than average");
        }else{
            System.out.println("Less expensive than average");
        }
    }

    public static void flipRecommendation(boolean flip){
        if(flip == true){
            flip = false;
        }else if(flip == false){
            flip = true;
        }
        System.out.println(flip);
    }
}
