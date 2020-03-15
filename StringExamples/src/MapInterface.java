

import java.util.HashMap;
import java.util.Map;

public class MapInterface {

	public static void main(String[] args) {
		Map<Integer, String> map = new HashMap<Integer, String>();
		map.put(1, "a");
		map.put(2, "b");
		map.put(3, "c");
		
		System.out.println(map.get(7));

	}

}
