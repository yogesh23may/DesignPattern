package abstractFactory;

public class Blue  implements Color{

	@Override
	public void fill() {
		System.out.println("filling blue color...");
	}

	public Blue() {
		super();
		System.out.println("blue instance created...");
	}
	

}
