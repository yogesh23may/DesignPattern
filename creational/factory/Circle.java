package factory;

public class Circle implements Shape {

	
	@Override
	public void draw() {
		System.out.println("drawing circle ...");
	}

	public Circle() {
		super();
		System.out.println("circle instance created...");
	}

}
