package javatwo;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;

// List, Set, Queue


public class Simple3 {

	public static void main(String[] args) {

		List <Integer> list = new LinkedList<>();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(10);
		list.add(40);
		list.add(50);
		list.add(10);
		
		System.out.println(list);
		

		List <Integer> list1 = new LinkedList<>(list);
		System.out.println(list1);
		list1.add(23);
		list1.remove((Integer)10);
		System.out.println(list1);
		list1.add(0, 100);
		System.out.println(list1);
		
		List <Integer> list2 = new LinkedList<>();
		System.out.println("list 2: " + list2);
		list2.addAll(list1);
		System.out.println("list 2: " + list2);
		list2.addAll(3, list);
		System.out.println("list 2: " + list2);
		list2.removeAll(list1);
		System.out.println("list 2: " + list2);
		
		Object [] arr = list2.toArray();
		System.out.println(Arrays.toString(arr));
		
	}

}

