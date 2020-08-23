package prototype;

import java.util.HashMap;
import java.util.Map;

public class StructureCache {
	private static Map<String,Structure> structMap = new HashMap<String,Structure>();
	
	public static Structure getStructure(String structId){
		Structure cachedStructure = structMap.get(structId);
		return (Structure)cachedStructure.clone();
	}
	
	public static void loadCache(){
		Triangle triangle = new Triangle();
		triangle.setId("1");
		structMap.put(triangle.getId(),triangle);
		
		Pentagon pentagon = new Pentagon();
		pentagon.setId("2");
		structMap.put(pentagon.getId(), pentagon);
		
		Decagon decagon = new Decagon();
		decagon.setId("3");
		structMap.put(decagon.getId(),decagon);
	}
}
