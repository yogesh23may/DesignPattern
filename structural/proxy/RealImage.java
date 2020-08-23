package proxy;

public class RealImage implements Image {
	private String fileName;
	
	public RealImage(String fileName) {
		super();
		this.fileName = fileName;
		loadFromDisk();
	}

	@Override
	public void dispaly() {
		System.out.println("displaying "+fileName);
	}
	
	private void loadFromDisk(){
		System.out.println("loading "+fileName);
	}

}
