/*
 * the Command design pattern encapsulates commands (method calls) in objects allowing us to issue requests 
 * without knowing the requested operation or the requesting object.
 * 
 * Command pattern is a data driven design pattern.
 * A request is wrapped under a object as command and passed to invoker object.
 * Invoker object looks for the appropriate object which can handle this command and pass the command to the corresponding object and that object executes the command.
 * 
 * We've created an interface Order which is acting as a command. 
 * We've created a Stock class which acts as a request.
 * We've concrete command classes BuyStock and SellStock implementing Order which will do actual 
 * command processing.
 * A class Broker is created which acts as a invoker object. It can take order and place orders.
 */

package command;

public class Main {

	public static void main(String[] args) {
		Stock stock = new Stock();
		BuyStock buyStock = new BuyStock(stock);
		SellStock sellStock = new SellStock(stock);
		
		Broker broker = new Broker();
		broker.takeOrders(buyStock);
		broker.takeOrders(sellStock);
		
		broker.placeOrders();		
	}
}
