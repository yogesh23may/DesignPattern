package abstractFactory;

public class ShapesFactory extends AbstractFactory{
	@Override
	public Shapes getShape(String type){
		Shapes shapes = null;
		if(type!=null){
			if(type.equalsIgnoreCase("circle"))
				shapes = new Circles();
			else if(type.equalsIgnoreCase("square"))
				shapes = new Squares();
			else if(type.equalsIgnoreCase("rectangle"))
				shapes = new Rectangles();
			else
				shapes = null;
		}else{
			shapes=null;
		}
		return shapes;
	}

	@Override
	public Color getColor(String colorName) {
		return null;
	}
}
