package collections.concepts;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListConcept {

	public static <E> void main(String[] args) {
		 
		int a[] = new int[4];
		
		System.out.println(a.length);
		
		/* is a static array size is fixed
		 * array list is a dynamic array
		 * can contain duplicate values
		 * maintains insertion order
		 synchronized*/
		
		ArrayList ar = new ArrayList();
		ar.add(100);
		ar.add(200);
		ar.add("ragini");
		ar.add(12.34);
		ar.add(true);
		
		System.out.println(ar.size());
		
		/*
		 * to print all the values of arry we use for loop and iterator
		 */
		
		for(int i=0;i<ar.size();i++) {
			System.out.println(ar.get(i));
		}
		/*non generic vs generic
		 */ 
		 
		ArrayList<Integer> ar1 = new ArrayList<>();
		ar1.add(100);
		ar.add(200);
		ArrayList<String> s1 = new ArrayList<>();
		s1.add("Ragini");
		
		/*
		 * if we dont know what data type we use E
		 */
		ArrayList<E> ar3= new ArrayList<>();
		
		Employees e1 = new Employees("ragini",25,34);
		Employees e2 = new Employees("aarush",2,2);
		Employees e3 = new Employees("aditya",3,7);
		
		ArrayList<Employees>  ar4 = new ArrayList<>();
		
		// adding with object employees
		ar4.add(e1);
		ar4.add(e2);
		ar4.add(e3);
		
		//create iterator
		Iterator<Employees> it =  ar4.iterator();
		while(it.hasNext()) {
			Employees emp = it.next();
			System.out.println(emp.name);
			System.out.println(emp.age);
			System.out.println(emp.id);
		}
		
		
		System.out.println("###################");
		//Addall 
		
		ArrayList ar5 = new ArrayList();
		ar5.add(100);
		ar5.add(200);
		
		ArrayList ar6 = new ArrayList();
		
		ar6.add("ragini");
		ar6.add(12.34);
		ar6.add(true);
		
		ar5.addAll(ar6);
		
		//remove all
		
		ar5.removeAll(ar6);
		
		for(int i=0;i<ar5.size();i++) {
			System.out.println(ar5.get(i));
		}
		
		//retain all
		/*only common part will be printed*/
		ArrayList ar7 = new ArrayList();
		ar7.add(100);
		ar7.add(200);
		ar7.add("ragini");
		ArrayList ar8 = new ArrayList();
		
		ar8.add("ragini");
		ar8.add(100);
		ar8.add(true);
		
		ar7.retainAll(ar8);
		System.out.println("###################");
		
		for(int i=0;i<ar7.size();i++) {
			System.out.println(ar7.get(i));
		}

	}

}
