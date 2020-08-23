/*
 * In Factory pattern, we create object without exposing the creation logic to the client 
 * and refer to newly created object using a common interface
 */
package factory;

public class Main {

	public static void main(String[] args) {
		Shape circle = new ShapeFactory().getShape("circle");
		if(circle!=null){circle.draw();}
		
		Shape square = new ShapeFactory().getShape("square");
		if(square!=null){square.draw();}
		
		Shape rectangle = new ShapeFactory().getShape("rectangle");
		if(rectangle!=null){rectangle.draw();}
	}

}
