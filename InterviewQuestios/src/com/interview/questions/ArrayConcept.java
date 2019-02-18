package com.interview.questions;

public class ArrayConcept {

	public static void main(String[] args) {
		//int array
		
		/*notes:*?
		 * lowest bound of array 0
		 * upper bound/index n-1 n is length of an array
		 * dis-advantages of an array
		 * 1size is fixed: to overcome this problem we use collections which are hashtable,arraylist
		 * 2data type should be same for all the values : to overcome this problem we use objectarray
		 * object array stores all kinds of datatypes
		 * if we try to print the value more the the array length then ArrayIndexOutofBoundaryException get print
		 */
		
		int i[] = new int[4];
		i[0] = 20;
		i[1] = 30;
		i[2] = 40;
		i[3] = 50;
		System.out.println(i[3]);
		for(int j=0;j<i.length;j++) {
			System.out.println(i[j]);
		}
		//double array
		double d[] = new double[4];
		d[0] = 15.30;
		d[1] = 15.70;
		System.out.println(d[0]+d[1]);
		
	//	char array
		
		char c[] = new char[5];
		c[0] = 'a';
		c[1] = 'b';
		System.out.println(c[0]+c[1]);
	
		//boolean array
   boolean b[] = new boolean[2];
		   b[0] = true;
            b[1] = false;
	
	//String array
	String s[] = new String[3];
	s[0] = "hello";
	
	//object array object is a class
	Object ob[] = new Object[5];
	ob[0] = 1;
	ob[1] = "hello";
	ob[2] = true;
	ob[4] = 45.34;
	ob[5] = 'a';
			

}
}
