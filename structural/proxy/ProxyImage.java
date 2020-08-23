package proxy;

public class ProxyImage implements Image {
	private RealImage realImage;
	private String fileName;
	
	
	public ProxyImage(String fileName) {
		super();
		this.fileName = fileName;
	}


	@Override
	public void dispaly() {
		if(realImage==null){
			realImage = new RealImage(fileName);
		}
		realImage.dispaly();
	}

}
