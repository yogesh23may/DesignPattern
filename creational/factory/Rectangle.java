package factory;

public class Rectangle implements Shape {

	@Override
	public void draw() {
		System.out.println("drawing rectangle...");	
	}

	public Rectangle() {
		super();
		System.out.println("rectangle instance created...");	
	}
	

}
