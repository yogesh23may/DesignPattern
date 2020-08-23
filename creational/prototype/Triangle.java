package prototype;

public class Triangle extends Structure {

	@Override
	void draw() {
		System.out.println("drawing triangle...");
	}

	public Triangle() {
		super();
		type="triangle";
		System.out.println("triangle instance created["+this.hashCode()+"]...");
	}
}
