package builder;

public class Burger implements Item {

	@Override
	public String name() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Packing packing() {
		// TODO Auto-generated method stub
		return new Wrapepr();
	}

	@Override
	public float price() {
		// TODO Auto-generated method stub
		return 0;
	}

}
