import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListInterface {

	public static void main(String[] args) {
//		List lst = new ArrayList();
//		lst.add("Test");
//		lst.add(5.737);
//		lst.add(true);
//		lst.add('r');
		
//		System.out.println(lst.size());
//		for(int i=0; i<lst.size(); i++)
//		{
//			System.out.println(lst.get(i));
//		}
//		for(Object x:lst)
//		{
//			System.out.println(x);
//		}
//		Iterator itr = lst.iterator();
//		while(itr.hasNext())
//			System.out.println(itr.next());
		
		//Generic Type : We can store the data of the mentioned data type
		List<Integer> lst1 = new ArrayList<Integer>();
		lst1.add(5);
		lst1.add(77);
		
		for(Integer x:lst1)
			System.out.println(x);
	}

}
