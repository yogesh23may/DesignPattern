/*
 * This factory is also called as Factory of factories.
 * In Abstract Factory pattern an interface is responsible for creating a factory of related objects, 
 * without explicitly specifying their classes. 
 * Each generated factory can give the objects as per the Factory pattern
 */
package abstractFactory;

import factory.Circle;

public class Main {
	public static void main(String[] args) {
		FactoryProducer factoryProducer = new FactoryProducer();
		
		ColorFactory colorFactory = (ColorFactory) factoryProducer.getFactory("color");
		Red red = (Red) colorFactory.getColor("red");
		red.fill();
		
		ShapesFactory shapesFactory = (ShapesFactory) factoryProducer.getFactory("shapes");
		Circles circles = (Circles) shapesFactory.getShape("circle");
		circles.draw();
	}
}
