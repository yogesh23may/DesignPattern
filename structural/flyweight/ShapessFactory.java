package flyweight;

import java.util.HashMap;
import java.util.Map;

public class ShapessFactory {
	private static Map<String,Shapess> map = new HashMap<String, Shapess>();
	
	public static Shapess getCircle(String color){
		Circles circles = null;
		if(color!=null && map.containsKey(color)){
			circles = (Circles) map.get(color);
		}else{
			circles = new Circles(color);
			map.put(color, circles);
		}
		return circles;
	}
}
