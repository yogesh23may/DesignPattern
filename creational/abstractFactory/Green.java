package abstractFactory;

public class Green  implements Color{

	@Override
	public void fill() {
		System.out.println("filling green color...");
	}

	public Green() {
		super();
		System.out.println("green instance created...");
	}
	
	

}
