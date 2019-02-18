package objectorientedconcepts;

public class StringToInteger {

	public static void main(String[] args) {
		
		//String to integer
		
		String s = "100";
		int i = Integer.parseInt(s);
		System.out.println(i);
		
		//string to double
		String sd = "200.30";
		double d = Double.parseDouble(sd);
		System.out.println(d);
		
		//string to boolean
		String sb = "true";
		boolean b = Boolean.parseBoolean(sb);
		System.out.println(b);
		
		//int to string conversation
		
		int num = 20;
		String st = String.valueOf(num);
		System.out.println(st+30);

	}

}
