package proxy;

/*
 * In Proxy pattern, a class represents functionality of another class.
 * In Proxy pattern, we create object having original object to interface its functionality to outer world.
 */
public class Main {

	public static void main(String[] args) {
		RealImage realImage = new RealImage("temp.jpg");
		realImage.dispaly();
		
		ProxyImage proxyImage = new ProxyImage("elep.png");
		proxyImage.dispaly();
	}

}
