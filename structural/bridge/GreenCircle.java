package bridge;

public class GreenCircle implements DrawAPI {

	@Override
	public void drawCircle(int radius, int x, int y) {
		System.out.println("drawing green [color:red ,radius:"+radius+",x:"+x +",y:"+y+"]");
	}

}
