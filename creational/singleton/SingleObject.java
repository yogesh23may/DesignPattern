package singleton;

public class SingleObject {
	private static SingleObject instance = new SingleObject();
	private SingleObject() {}
	public static SingleObject getInstance(){
		instance.showMsg();
		return instance;
	}
	private void showMsg(){
		System.out.println("object created...");
	}
}
