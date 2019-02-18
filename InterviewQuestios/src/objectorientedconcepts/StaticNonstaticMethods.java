package objectorientedconcepts;

public class StaticNonstaticMethods {
	
	String name= "test";
	static int age = 30;
	
	
public static void main(String[] args) {
		System.out.println(age);
		StaticNonstaticMethods obj = new StaticNonstaticMethods();
		System.out.println(obj.name);
		test();
		StaticNonstaticMethods.test();
		obj.sendText();

	}
public static void test() {
	
	
	System.out.println(40);
	
}
public void sendText() {
	System.out.println("hellow");
}

}
