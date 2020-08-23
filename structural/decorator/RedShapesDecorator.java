package decorator;

public class RedShapesDecorator extends ShapesDecorator {

	public RedShapesDecorator(Shapes shapes) {
		super(shapes);
	}
	
	@Override
	public void draw() {
		shapes.draw();
		setRedBorder(shapes);
	}
	
	private void setRedBorder(Shapes decoratedShape){ 
		System.out.println("Border Color: Red"); 
	}
}
