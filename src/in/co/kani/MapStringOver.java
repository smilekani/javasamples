package in.co.kani;

import java.util.HashMap;
import java.util.Map;

public class MapStringOver {
	
	private Map<Key, String> hashmap = new HashMap<>();
	Key key1 = new Key("kani");
	Key key2 = new Key("kani");
	Key key3 = new Key("kani");
	Key key4 = new Key("kani");
	Key key5 = new Key("kanimo");
	
	public MapStringOver() {
		hashmap.put(key1, "kan");
		hashmap.put(key2, "kala");
		hashmap.put(key3, "kala");
		hashmap.put(key4, "kala");
		hashmap.put(key5, "kala");

	}
	
	public static void main(String[] args) {

		MapStringOver overriding = new MapStringOver();
		System.out.println("HashMap = "+overriding.hashmap);
		int key1hascode = overriding.key1.hashCode();
		System.out.println("Hash String key1hascode= "+key1hascode);
		int key2hascode = overriding.key2.hashCode();
		System.out.println("Hash String key1hascode= "+key2hascode);
		System.out.println(overriding.key1.equals(overriding.key2));
		System.out.println("Map size = "+overriding.hashmap.size());
		System.out.println("hashmap index - "+overriding.hashmap.get(overriding.key4));
		System.out.println("HashMap keyset = "+overriding.hashmap.keySet());
		

	}}
