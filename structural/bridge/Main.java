/*
 * Bridge is used where we need to decouple an abstraction from its implementation so that the two 
 * can vary independently.
 * Case  I: Shape <|----- Circle ,abstraction coupled with implementation.
 * Case II: Shape <|----- Circle <>--------->uses DrawAPI ,DrawAPI has decoupled abstraction with implementation
 * 													^
 * 													|
 * 												RedCircle						
 * 
 * 
 * Shape <|-----Circle<>----
 *  ^						|
 *  |						|
 *  |						|
 * Circle2<>-------------DrawAPI<|-----GreenCircle 
 * 							^
 * 							|
 * 						 RedCircle
 * 
 * In the above dia ,shape has expanded without affecting DrawAPI & DrawAPI has expanded withou affecting Shape 
 */
package bridge;

public class Main {

	public static void main(String[] args) {
		Shape redCircle = new Circle(5, 5, 25, new RedCircle());
		Shape greenCircle = new Circle(10, 10, 100, new GreenCircle());
		redCircle.draw();
		greenCircle.draw();
	}
}
