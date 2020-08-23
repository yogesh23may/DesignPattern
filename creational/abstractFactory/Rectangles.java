package abstractFactory;

public class Rectangles implements Shapes {

	@Override
	public void draw() {
		System.out.println("drawing rectangle...");	
	}

	public Rectangles() {
		super();
		System.out.println("rectangle instance created...");	
	}
	

}
