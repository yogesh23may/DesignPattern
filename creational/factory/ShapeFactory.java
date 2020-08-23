package factory;

public class ShapeFactory {
	public Shape getShape(String type){
		Shape shape = null;
		if(type!=null){
			if(type.equalsIgnoreCase("circle"))
				shape = new Circle();
			else if(type.equalsIgnoreCase("square"))
				shape = new Sqaure();
			else if(type.equalsIgnoreCase("rectangle"))
				shape = new Rectangle();
			else
				shape = null;
		}else{
			shape=null;
		}
		return shape;
	}
}
