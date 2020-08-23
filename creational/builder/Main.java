/*
 * Builder pattern builds a complex object using simple objects and using a step by step approach.
 * A Builder class builds the final object step by step. This builder is independent of other objects.
 */
package builder;

public class Main {

	public static void main(String[] args) {
		MealBuilder mealBuilder = new MealBuilder();
		Meal vegMeal = mealBuilder.prepareVegMeal();
		System.out.println("veg meal details are:-");
		System.out.println("======================");
		vegMeal.showItems();
		vegMeal.getCost();
		System.out.println("\n");
		System.out.println("non veg meal details are:-");
		System.out.println("==========================");
		Meal nonVegMeal = mealBuilder.prepareNonVegMeal();
		nonVegMeal.showItems();
		nonVegMeal.getCost();
	}

}
