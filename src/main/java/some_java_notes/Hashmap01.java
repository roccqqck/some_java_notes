package some_java_notes;

import java.util.Map;
import java.util.TreeMap;
import java.util.HashMap;
import java.util.LinkedHashMap;

public class Hashmap01 {

	public static void main(String[] args) {
		
		////////////////
		// java map is similar to python dictionary
		////////////////
		
		
		System.out.println("HashMap");

		HashMap<Integer, String> hashMap = new HashMap<Integer, String>();

		hashMap.put(2, "Tue");
		hashMap.put(3, "Wed");
		hashMap.put(1, "Mon");
		hashMap.put(4, "Thu");
		hashMap.put(5, "Fri");

		for (Map.Entry<Integer, String> entry : hashMap.entrySet()) {
			System.out.println(entry.getKey() + "   " + entry.getValue());
		}
		
		System.out.println("LinkedHashMap");

		Map<String, String> linkedHashMap = new LinkedHashMap<String, String>();

		linkedHashMap.put("2", "Tue");
		linkedHashMap.put("3", "Wed");
		linkedHashMap.put("1", "Mon");
		linkedHashMap.put("4", "Thu");
		linkedHashMap.put("5", "Fri");

		for (Map.Entry<String, String> entry : linkedHashMap.entrySet()) {
			System.out.println(entry.getKey() + "   " + entry.getValue());
		}
		
		System.out.println("TreeMap");

		Map<String, String> treeMap = new TreeMap<String, String>();

		treeMap.put("2", "Tue");
		treeMap.put("3", "Wed");
		treeMap.put("1", "Mon");
		treeMap.put("4", "Thu");
		treeMap.put("5", "Fri");

		for (Map.Entry<String, String> entry : treeMap.entrySet()) {
			System.out.println(entry.getKey() + "   " + entry.getValue());
		}

	}

}
