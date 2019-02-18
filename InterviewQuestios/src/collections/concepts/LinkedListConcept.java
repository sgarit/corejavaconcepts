package collections.concepts;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListConcept {

	public static void main(String[] args) {
		LinkedList<String> ll = new LinkedList<>();

		ll.add("Ragini");
		ll.add("ravi");
		ll.add("aditya");
		ll.add("aarush");

		// System.out.println(ll.get(0));

		ll.addFirst("amala");
		System.out.println(ll.get(0));
		ll.addLast("anil");

		System.out.println(ll.getLast());
		System.out.println(ll.getFirst());

		ll.set(0, "rags");
		System.out.println("first element " + ll.getFirst());

		// remove to remove some details

		ll.remove(0);
		ll.removeFirst();
		ll.removeLast();

		// using for loop retrive the data

		for (int i = 0; i < ll.size(); i++) {
			System.out.println(ll.get(i));
		}

		System.out.println("content" + ll);

		// using advanced for loop

		for (String str : ll) {

			System.out.println("using advanced for loop" + str);

		}

		// using iterator
		System.out.println("iterator=========");
		Iterator<String> it = ll.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}

		// using while loop
		System.out.println("using while loop-======");
		int num = 0;
		while (ll.size() > num) {
			System.out.println(ll.get(num));
			num++;
		}

	}

}
