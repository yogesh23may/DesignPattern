package builder;

import java.util.ArrayList;
import java.util.List;

public class MealBuilder {
	
	public Meal prepareVegMeal(){
		Meal vegMeal = new Meal();
		vegMeal.addItem(new VegBurger());
		vegMeal.addItem(new Pepsi());
		return vegMeal;
	}
	
	public Meal prepareNonVegMeal(){
		Meal nonVegmeal = new Meal();
		nonVegmeal.addItem(new NonVegBurger());
		nonVegmeal.addItem(new Coke());
		return nonVegmeal;
	}
	
	
}
