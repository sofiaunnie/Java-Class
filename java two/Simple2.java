package javatwo;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;

// List, Set, Queue


public class Simple2 {

	public static void main(String[] args) {

		List <Integer> list = new LinkedList<>();
		int x = 1;
		Integer y = 1;
		
		list.add(x);
		list.add(2);
		list.add(3);
		list.add(y);

//		System.out.println(list);
//		list.remove(Integer.valueOf(x));
//		System.out.println(list);

		List list2 = Arrays.asList(2, 3, 4, 5);
		Integer [] arr = {2, 3, 4, 5};
		List <Integer> list3 = Arrays.asList(arr);
//		System.out.println(list3.contains(2));
//		list3.add(y);
//		System.out.println("arr: " + Arrays.toString(arr));
//		list3.set(1, 1);
//		System.out.println(list3);
//		System.out.println("arr: " + Arrays.toString(arr));
		
		List <Integer> list4 = new ArrayList<>(Arrays.asList(arr));
		System.out.println("arr: " + Arrays.toString(arr));
		list4.set(1, 1);
		System.out.println("arr: " + Arrays.toString(arr));
		System.out.println("list4: " + list4);

	}

}

