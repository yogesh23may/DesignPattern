package mediator;

public class Main {

	public static void main(String[] args) {
		User john = new User("john");
		john.sendMessage("i m john");
		
		User kathy = new User("kathy");
		kathy.sendMessage("i m kathy");

	}
}
