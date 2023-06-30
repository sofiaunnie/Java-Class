package javatwo;

import java.util.Set;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.TreeSet;

// List, Set, Queue

public class LoopThrough {

	public static void main(String[] args) {

		List<Integer> list = new LinkedList<>();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(10);
		list.add(40);
		list.add(50);
		list.add(10);

		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}

		for (int i : list) {
			System.out.println(i);
		}

		Iterator it = list.iterator();
		while (true) {
			if (it.hasNext())
				System.out.println(it.next());
			else
				break;
		}

		it = list.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}

		it = list.iterator();
		for (; it.hasNext();) {
			System.out.println(it.next());
		}

		for (it = list.iterator(); it.hasNext();) {
			System.out.println(it.next());
		}

	}

}
