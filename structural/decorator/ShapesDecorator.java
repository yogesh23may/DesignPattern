package decorator;

public class ShapesDecorator implements Shapes {
	
	protected Shapes shapes;
	public ShapesDecorator(Shapes shapes) {
		super();
		this.shapes = shapes;
	}

	@Override
	public void draw() {
		shapes.draw();
	}

}
