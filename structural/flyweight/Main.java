/*
 * Flyweight pattern is primarily used to reduce the number of objects created, 
 * to decrease memory footprint and increase performance.
 * Flyweight pattern try to reuse already existing similar kind objects by storing them 
 * and creates new object when no matching object is found.
 */
package flyweight;

public class Main {
	private static final String[] colors = {"red","green","blue","yellow"};
	
	public static void main(String[] args) {
		ShapessFactory factory = new ShapessFactory();
		Circles circle = (Circles) factory.getCircle(colors[0]);
		circle.setX(getRandomX());
		circle.setY(getRandomY());
		circle.setRadius(getRandomColor());
		circle.draw();
		
		Circles circle1 = (Circles) factory.getCircle(colors[0]);
		System.out.println(circle.hashCode() +"|" +circle1.hashCode());
		
	}
	
	private static int getRandomY() {
		return (int)(Math.random() * 10 );
	}

	private static int getRandomX() {
		return (int)(Math.random() * 20 );
	}

	private static int getRandomColor(){
		return (int)(Math.random() *colors.length );
	}
}
