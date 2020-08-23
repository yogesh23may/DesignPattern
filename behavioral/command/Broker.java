package command;

import java.util.ArrayList;
import java.util.List;

public class Broker {
	private List<Order> listOrder;

	public Broker() {
		super();
		listOrder = new ArrayList<Order>();
	}
	
	public void takeOrders(Order order){
		listOrder.add(order);
	}
	
	public void placeOrders(){
		for(Order order:listOrder){
			order.execute();
		}
	}
}
