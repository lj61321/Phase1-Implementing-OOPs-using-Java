import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class MapDemo {
	public static void main(String[] args) {
		
		Map<Integer, String> map = new HashMap<>();
		map.put(123, "Deebika");
		map.put(456, "Leon");
		map.put(345, "Surekha");
		map.put(555, "Deter");
		map.put(null, "Mary");
		map.put(7889, "Voodoo");
		map.put(666, "Satin");
		
		System.out.println(map.size() + " : " + map);
		
		//insertion order is followed using a LinkedHashMap
		Map<Integer, String> map1 = new LinkedHashMap<>();
		map1.put(123, "Deebika");
		map1.put(456, "Leon");
		map1.put(345, "Surekha");
		
		System.out.println(map1.size() + " : " + map1);
		
		//use TreeMap to sort based on the Key
		Map<Integer, String> map3 = new TreeMap<>();
		map3.put(123, "Deebika");
		map3.put(456, "Leon");
		map3.put(345, "Surekha");
		
		System.out.println(map3.size() + " : " + map3);
		
		//retrieved values using keys
		Set<Integer> keys = map.keySet();
		for(Integer key:keys) {
			String value = map.get(key); //returns value associated with the key
			System.out.println(key + " : " + value);
			
		}
		System.out.println("----------------Print only Values--------------");
		Collection<String> allValues = map.values();
		for(String value: allValues) {
			System.out.println(value);
		}//note that you can not print keys using values as a key
		System.out.println("----------------Remove key/value pair--------------");
		boolean isRemoved = map.remove(666, "Satin");
		System.out.println(isRemoved);
		System.out.println(map.size() + " : " + map);
		System.out.println("-----------------Retrieval of both key/value pairs--------------");
		/* iterate to get associate key/value pairs
		 * using an inter-interface
		 * accessible through map.Entry
		 */
		Set<Map.Entry<Integer, String>> mapEntry = map.entrySet();
		for (Entry<Integer, String> entry : mapEntry) {
			Integer key = entry.getKey();
			String value = entry.getValue();
			System.out.println(key + " : " + value);
		}
	}
}
