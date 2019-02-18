package objectorientedconcepts;

public class Functions {

	public static void main(String[] args) {
		
		Functions object = new Functions();
		object.test();
		object.testint();
		int sum = object.testint();
		System.out.println(sum);
		System.out.println(object.TextPrint());

	}
	
	public void test() {
		System.out.println("ragini hi");
	}
	public int testint() {
		int a = 10;
		int b = 30;
		int c = a+b;
		return c;
	}
	public String TextPrint() {
		String text = "hellow";
		//System.out.println(text);
		return text;
	}

}
