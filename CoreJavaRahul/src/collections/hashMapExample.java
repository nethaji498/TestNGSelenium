package collections;

import java.util.HashMap;

public class hashMapExample {

	public static void main(String[] args) {
		
		//Takes the values in the form of Key Value pairs
		
		HashMap<Integer, String> hm=new HashMap<Integer, String>();
		
		hm.put(0, "Hello");
		hm.put(1, "good bye");
		hm.put(42, "Morning");
		hm.put(3, "evening");
		
//		System.out.println(hm.get(2));  //prints value at key 2
		System.out.println(hm.get(42));
		hm.remove(42);
		System.out.println(hm.remove(42));

	}

}
