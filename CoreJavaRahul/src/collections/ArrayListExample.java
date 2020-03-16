package collections;

import java.util.ArrayList;

public class ArrayListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> a =new ArrayList<String>();
		
		a.add("Nethaji");
		a.add("Java");
		a.add("Java");
		a.add("Raju");
		a.add(0,"Student");
		
		System.out.println(a.remove(1));
		System.out.println(a);
		//a.remove("Java1");
		//a.removeAll(a);
		
		//System.out.println(a);
		
		System.out.println(a.get(2)); //gives the string present at index
		
		System.out.println(a.contains("Raju")); //whether the string present or not
		
		System.out.println(a.indexOf("Raju"));
		
		System.out.println(a.isEmpty()); //whether the array is empty or not, if empty true
		
		System.out.println(a.size());  //gives size of array (a.length in Arrays for length)
	
		
	}

}
