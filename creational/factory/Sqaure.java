package factory;

public class Sqaure implements Shape {

	@Override
	public void draw() {
		System.out.println("drawing square...");	
	}

	public Sqaure() {
		super();
		System.out.println("square instance created...");	
	}
	

}
