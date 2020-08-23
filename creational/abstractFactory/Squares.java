package abstractFactory;

public class Squares implements Shapes {

	@Override
	public void draw() {
		System.out.println("drawing square...");	
	}

	public Squares() {
		super();
		System.out.println("square instance created...");	
	}
	

}
