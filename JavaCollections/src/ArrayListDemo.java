
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// ArrayList is a predefined class
public class ArrayListDemo {
	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>(); //Note initial capacity of 10
		//System.out.println(list.size() +" : " + list);
		
		//add elements
		list.add(new Integer(10)); // termed boxing - introduced in jdk 1.4
		list.add(90); //auto-boxing - introduced  jdk 1.5 onward
		list.add(10);
		System.out.println(list.size() +" : " + list);
		
		//insert element
		list.add(1,100);
		System.out.println(list.size() +" : " + list);
		list.add(2,200);
		list.add(3,500);
		System.out.println(list.size() +" : " + list);
		
		//array search operation
		boolean isElementAvailable = list.contains(10);
		if (isElementAvailable)
			System.out.println("Element found!");
		else
			System.out.println("Element not found!");
		
		
		//update operation
		list.set(1,500);
		System.out.println(list.size() +" : " + list);
		
		//element removal
//		Integer removed = list.remove(1); //remove element at index[1]
//		System.out.println(removed);
//		System.out.println(list.size() +" : " + list);
//		
//		
		//iteration
		System.out.println("-----------for loop can only be used for index operation ----------");
		for(int i = 0; i<list.size(); i++) {
			System.out.println(list.get(i));
		}	
		System.out.println("---------- for each ----------");
		for(Integer value: list) {
			System.out.println(value);
		}
		
		System.out.println("---------- Iterator I/F ----------");
		Iterator<Integer> itr = list.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
	}
}
