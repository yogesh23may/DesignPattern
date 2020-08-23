package abstractFactory;

public abstract class AbstractFactory {
	public  abstract Color getColor(String colorName);
	public abstract Shapes getShape(String type);
}
