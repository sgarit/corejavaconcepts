package Arrays;

import java.util.Hashtable;

public class HashTableConcept {

	public static void main(String[] args) {
		
		Hashtable h = new Hashtable();
		
		h.put(1, 100);
		h.put(2, 200);
		
		h.put("A", "Name");
		h.put("B", "Test");
		
		System.out.println(h.get(2));
		
		System.out.println(h.size()); 
		
		for(int i = 0;i<(h.size());i++) {
			System.out.println("r"+h.get(i));
		}
		
		Hashtable<Integer,Integer> ar2 = new Hashtable<Integer,Integer> ();
		
		//ar2.add(6,600);
		
		
		
	}

}
