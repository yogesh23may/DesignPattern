package prototype;

public class Pentagon extends Structure {

	@Override
	void draw() {
		System.out.println("drawing pentagon...");		
	}

	public Pentagon() {
		super();
		type="pentagon";
		System.out.println("pentagon instance created["+this.hashCode()+"]...");
	}

}
