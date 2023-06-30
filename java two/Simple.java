package javatwo;

import java.util.List;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Iterator;

// The 3 types of interface - List, Set, Queue

public class Simple {

	class Student {
		String name;

		Student(String name, int age) {
			this.name = name;
		}

		public String toString() {
			return name;
		}
	}
	
	public static void main(String[] args) {

		List list = new LinkedList();
		list.add("sdfghjkl");
		list.add(234);
		list.add(56.67);
		list.add(45.56f);
		list.add('s');
		list.add(false);
		list.add(234);

//		System.out.println(list);
//		System.out.println(list.size());
//		System.out.println(list.get(3));
//		list.remove(2);
//		System.out.println(list);
//		list.set(0, "Lawson");
//		System.out.println(list);
//		System.out.println(list.contains("Lawson"));
//		System.out.println(list.contains("Sophie"));

//		for (int i = 0; i < list.size(); i++) {
//			System.out.println(list.get(i));
//		}

//		for (Object obj : list) {
//			System.out.println(obj);
//		}

		Iterator it = list.iterator();

//		for(int i = 0; i < 7; i++) {
//			System.out.println(it.hasNext());
//		}

//		while (it.hasNext()) {
//			System.out.println(it.next());
//		}

		System.out.println(list);
		System.out.println(list.indexOf(234));
		System.out.println(list.lastIndexOf(234));

// List, Set, Queue

}}


	

