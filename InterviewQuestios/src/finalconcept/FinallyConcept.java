package finalconcept;

public class FinallyConcept {

	public static void main(String[] args) {
		
       // test();
		//test1();
		division();
	}
	
	public static void test() {
		try{
			
			System.out.println("inside the try block");
			throw new RuntimeException("test");
		}
		catch(Exception e) {
			System.out.println("inside the catch block");
		}
		finally {
			System.out.println("inside the final block");
		}
		
	}
	
	public static void test1() {
		try {
			System.out.println("inside try block");
		}
		finally {
			System.out.println("inside the catch block");
		}
	}
	
	/*public static void division() {
		int i = 10;
		try {
			System.out.println("inside try block");
		}
		catch(ArithmeticException e) {
			System.out.println("exception found");
			
		}
		finally{
			System.out.println("final exception");
		}
	}*/
	public static void division() {
		int i = 10;
		try {
			System.out.println("inside try block");
			int k = i/0;
		}
		catch(NullPointerException e) {
			System.out.println("exception found");
			
		}
		finally{
			System.out.println("final exception");
		}
	}

	
	/**
	 * finally will be called always even the exception is found
	 * in selenium we use driver.quit in finally block to quit the browser even we get any exceptions
	 */
	 
}
