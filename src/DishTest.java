public class DishTest {

    public static void main(String[] args){
        Dish dish1 = new Dish();
        dish1.costInCents = 1000;
        dish1.nameOfDish = "Three year old hotdog";
        dish1.wouldRecommend = false;
        dish1.printSummary();
        DishTools.shoutDishName(dish1.nameOfDish);
        DishTools.analyzeDishCost(dish1.costInCents);
        DishTools.flipRecommendation(dish1.wouldRecommend);
    }
}
