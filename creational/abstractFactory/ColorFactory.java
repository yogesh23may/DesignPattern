package abstractFactory;

public class ColorFactory extends AbstractFactory{
	@Override
	public Color getColor(String colorName){
		Color color = null;
		if(colorName!=null){
			if(colorName.equals("red"))
				color = new Red();
			else if(colorName.equals("green"))
				color = new Green();
			else if(colorName.equals("blue"))
				color = new Blue();
			else
				color = null;
		}else{
			colorName=null;
		}
		return color;
	}

	@Override
	public Shapes getShape(String type) {
		return null;
	}
}
