package flyweight;

public class Circles implements Shapess {
	private int x;
	private int y;
	private int radius;
	private String color;
	
	
	public Circles(String color) {
		super();
		this.color = color;
	}
	
	public void setX(int x) {
		this.x = x;
	}

	public void setY(int y) {
		this.y = y;
	}
	
	public void setRadius(int radius) { 
		this.radius = radius; 
	}	
	
	@Override
	public void draw() {
		System.out.println("Circle:[Color : " + color +", x : " + x +", y :"+ y +",radius :"+radius+"]");
	}


}
