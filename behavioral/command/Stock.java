package command;

public class Stock {
	private String name ="Smaug";
	private int quantity = 10;
	
	public void buy(){
		System.out.println("BUY["+name+":"+quantity+"]");
	}
	
	public void sell(){
		System.out.println("SELL["+name+":"+(quantity-5)+"]");
	}
	
}
