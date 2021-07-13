import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetDemo {
	public static void main(String[] args) {
		
		Set<Integer> set = new HashSet<>();
		set.add(20);
		set.add(10);
		set.add(2900);
		set.add(89);
		set.add(2);
		set.add(90);
		set.add(75);
		System.out.println("HashSet: " + set);

		//search method
		boolean isElementAvailable = set.contains(2);
		if(isElementAvailable)
			System.out.println("Element found");
		else
			System.out.println("Element not found");
		
		//element removal
//		boolean removed = set.remove(100);
//		if(removed)
//			System.out.println("element has been removed");
//		else
//			System.out.println("element not found");
//		System.out.println(set.size() +" : " + set);
//		
		//iteration
		System.out.println("---------- for each ----------");
		for(Integer value: set) {
			System.out.println(value);
		}
		
		System.out.println("---------- Iterator I/F ----------");
		Iterator<Integer> itr = set.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
//		set = new LinkedHashSet<>();
//		set.add(20);
//		set.add(10);
//		set.add(2900);
//		set.add(89);
//		set.add(2);
//		set.add(90);
//		set.add(20);
//		System.out.println("LinkedHashSet: " + set);
//		
//		set = new TreeSet<>();
//		set.add(20);
//		set.add(10);
//		set.add(2900);
//		set.add(89);
//		set.add(2);
//		set.add(90);
//		set.add(20);
//		System.out.println("TreeSet: " + set);
	
	
	}
}
