package singleton;

public class Service {
	private static Service instance = null;
	private Service() { }
	public static synchronized Service getInstance() {
		if(null == instance){
			instance = new Service();
		}
		return instance;
	}
	protected Object clone() throws CloneNotSupportedException {
		throw
		new CloneNotSupportedException("Clone is not allowed.");
	}
}