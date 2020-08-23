/*
 * Decorator pattern allows adding new functionality to an existing object without altering its structure.
 * This pattern creates a decorator class which wraps the original class and provides additional functionality 
 * keeping class methods signature intact.
 */
package decorator;

public class Main {

	public static void main(String[] args) {
		Parallelogram p1 = new Parallelogram();
		Rhombus r1 = new Rhombus();
		
		Shapes s1 = p1;
		s1.draw();
		
		Shapes s2 = new ShapesDecorator(p1);
		s2.draw();
		
		Shapes s3 = new RedShapesDecorator(p1);
		s3.draw();
		
		s1=r1;
		s1.draw();
		
		s2= new ShapesDecorator(r1);
		s2.draw();
		
		s3 = new RedShapesDecorator(r1);
		s3.draw();
	}

}
