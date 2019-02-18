package Arrays;

import java.util.ArrayList;

public class ArrayListConcept {

	public static void main(String[] args) {
		ArrayList ar = new ArrayList();
		ar.add(90);
		ar.add(100);
		
		ar.add("ragini");
		ar.add("nara");
		
		System.out.println(ar.size());
		
		for(int i = 0;i<ar.size();i++) {
			System.out.println(ar.get(i));
		}
		
		//to ristrict array list with data typees like only integers or String values
		
		ArrayList<Integer> ar1 = new ArrayList<Integer>();
		ar1.add(100);
		//ar1.add("hi");
		ar1.add(200);
		
		//for string
		ArrayList<String> ar2 = new ArrayList<String>();
		ar2.add("ragini");
		ar2.add("nara");
		ar2.add("100");
		

	}

}
