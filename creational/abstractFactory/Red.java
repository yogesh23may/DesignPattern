package abstractFactory;

public class Red implements Color{

	@Override
	public void fill() {
		System.out.println("filling red color...");
	}

	public Red() {
		super();
		System.out.println("red instance created...");
	}
}
