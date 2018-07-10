package in.co.kani;

import java.util.HashMap;
import java.util.Map;

public class MapHashcodeOverriding {

	private Map<MapObject, String> hashmap = new HashMap<>();
	static MapObject mapObject1 = new MapObject(1);

	public MapHashcodeOverriding() {
		populateMap();
	}

	private void populateMap() {
		hashmap.put(mapObject1, "One");
		hashmap.put(new MapObject(2), "Two");
		hashmap.put(new MapObject(2), "Three");
		hashmap.put(new MapObject(2), "Four");
		hashmap.put(new MapObject(5), "Five");
		hashmap.put(new MapObject(6), "Six");
		hashmap.put(new MapObject(7), "Seven");
	}

	public static void main(String[] args) {

		MapHashcodeOverriding overriding = new MapHashcodeOverriding();
		System.out.println("HashMap = "+overriding.hashmap);
		int string = overriding.hashmap.hashCode();
		System.out.println("Hash String = "+string);
		/*System.out.println("1 = "+overriding.hashmap.get(mapObject1).hashCode());
		System.out.println("2 = "+overriding.hashmap.get(2).hashCode());
		System.out.println("3 = "+overriding.hashmap.get(3).hashCode());
		System.out.println("4 = "+overriding.hashmap.get(4).hashCode());
		System.out.println("5 = "+overriding.hashmap.get(5).hashCode());*/
		System.out.println("Map size = "+overriding.hashmap.size());
		

	}
}
