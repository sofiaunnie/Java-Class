package javatwo;

import java.util.Set;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

// List, Set, Queue

public class Simple4 {

	public static void main(String[] args) {

		Set<Integer> set = new LinkedHashSet<>();
		set.add(10);
		set.add(20);
		set.add(30);
		set.add(10);
		set.add(40);
		set.add(50);
		set.add(10);
		set.add(5);

		System.out.println(set);
		System.out.println(set.add(60));
		System.out.println(set.add(60));

	}

}

