package abstractFactory;

public class FactoryProducer {
	public AbstractFactory getFactory(String typeOfFactory){
		AbstractFactory absFactory = null;
		if(typeOfFactory!=null){
			if(typeOfFactory.equalsIgnoreCase("color"))
				return new ColorFactory();
			else if(typeOfFactory.equalsIgnoreCase("shapes"))
				absFactory = new ShapesFactory();
			else
				absFactory = null;
		}else{
			absFactory = null;
		}
		return absFactory;
	}
}
