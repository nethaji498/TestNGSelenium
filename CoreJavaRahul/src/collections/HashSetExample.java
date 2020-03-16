package collections;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetExample {

	public static void main(String[] args) {
		//HashSet, LinkedHashSet, TreeSet implements set Interface
		//Set Interface does not accept duplicate values
		//No guarentee for elements stored in sequential order. May store in Random order

		HashSet<String> hs=new HashSet<String>();
		
		hs.add("USA");
		hs.add("UK");
		hs.add("India");
//		hs.add("India");
//		hs.remove("UK");
		System.out.println(hs.isEmpty());
		System.out.println(hs.size());
		System.out.println(hs);
		
		hs.add("Kummu");
		hs.add("Preveen");
		//Iterator help to traverse through each and every object
		
		Iterator<String> i = hs.iterator();
		
		//i.hasNext() checks whether the next element is available or not
		while(i.hasNext()) {
		System.out.println(i.next());
		}
	}

}
