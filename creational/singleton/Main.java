/*
 * This pattern involves a single class which is responsible to creates own object 
 * while making sure that only single object get created.
 * 
 */
package singleton;

public class Main {
	public static void main(String[] args) {
		SingleObject object1 = SingleObject.getInstance();
		System.out.println(object1.hashCode() );
				
		SingleObject object2 = SingleObject.getInstance();
		System.out.println(object2.hashCode() );
		
	}
}
