/*
 * Prototype pattern refers to creating duplicate object while keeping performance in mind.
 * This pattern involves implementing a prototype interface which tells to create a clone of the current object.
 * This pattern is used when creation of object directly is costly. 
 * For example, an object is to be created after a costly database operation. We can cache the object, 
 * returns its clone on next request and update the database as as and when needed thus reducing database calls.
 */
package prototype;

public class Main {

	public static void main(String[] args) {
		StructureCache.loadCache();
		
		Structure structure0 = StructureCache.getStructure("1");
		System.out.println(structure0.getType()+"|"+ structure0.hashCode());
		
		Structure structure1 = StructureCache.getStructure("1");
		Triangle triangle1 = (Triangle) structure1;
		System.out.println(structure1.getType() +"|"+ triangle1.hashCode());
		
		Structure structure2 = StructureCache.getStructure("2");
		System.out.println(structure2.getType() +"|"+ structure2.hashCode());
		
		Structure structure21 = StructureCache.getStructure("2");
		Pentagon pentagon21 = (Pentagon) structure21;
		System.out.println(structure2.getType() +"|"+ pentagon21.hashCode());
		
		Structure structure3 = StructureCache.getStructure("3");
		System.out.println(structure3.getType() +"|"+ structure3.hashCode());
		
		Structure structure31 = StructureCache.getStructure("3");
		Decagon decagon31 = (Decagon) structure31;
		System.out.println(structure3.getType() +"|"+ decagon31.hashCode());
	}
}
