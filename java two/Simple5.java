package javatwo;

import java.util.Map;
import java.util.Set;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;


public class Simple5 {

	public static void main(String[] args) {

		Map <Integer, String> mp = new TreeMap<>();
		mp.put(1, "ghj");
		mp.put(2, "one");
//		System.out.println(mp);
		mp.put(2, "two");
		System.out.println(mp);
//		System.out.println(mp.get(1));
//		System.out.println(mp.get(3));

		mp.put(21, "ewrt");
		mp.put(33, "werty");
		mp.put(4, "dfghjk");
		mp.put(0, "sedfgh");
		mp.put(15, "xcvb");
		mp.put(-2, "weerty");
		System.out.println(mp);
		
		System.out.println(mp.size());
		Set <Integer> keys = mp.keySet();
		
		for (Integer x : keys) {
			System.out.println(mp.get(x));
		}
		
		System.out.println("Values: " + mp.values());
		
	}

}
