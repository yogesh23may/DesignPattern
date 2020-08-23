package abstractFactory;

public class Circles implements Shapes {

	
	@Override
	public void draw() {
		System.out.println("drawing circle ...");
	}

	public Circles() {
		super();
		System.out.println("circle instance created...");
	}

}
