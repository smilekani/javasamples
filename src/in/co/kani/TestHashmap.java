package in.co.kani;

import java.util.HashMap;
import java.util.Map;

public class TestHashmap {
	
	private Map<Integer, Integer> testMap = new HashMap<>();
	
	
	public TestHashmap() {
		populateMap();
	}
	
	public void populateMap()
	{
		testMap.put(1, 1);
		testMap.put(1, 2);
		testMap.put(2, 2);
		testMap.put(2, 2);
		testMap.put(3, 3);
		testMap.put(3, 1);
	}
	
	
	
	
	@Override
	public int hashCode() {
		System.out.println("Execution inside Hascode....");
		return 0;
	}

	public static void main(String[] args) {
		TestHashmap hashmap = new TestHashmap();
		System.out.println("map ===> "+hashmap.testMap);
		System.out.println("map size = "+hashmap.testMap.size());
		int hashCode1 = hashmap.testMap.get(1).hashCode();
		System.out.println("hashCode1 = "+hashCode1);
		int hashCode2 = hashmap.testMap.get(2).hashCode();
		System.out.println("hashCode1 = "+hashCode2);
	}
}
