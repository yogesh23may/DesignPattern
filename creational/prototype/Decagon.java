package prototype;

public class Decagon extends Structure {

	@Override
	void draw() {
		System.out.println("drawing decagon...");		
	}

	public Decagon() {
		super();
		type="decagon";
		System.out.println("decagon instance created["+this.hashCode()+"]...");
	}

}
