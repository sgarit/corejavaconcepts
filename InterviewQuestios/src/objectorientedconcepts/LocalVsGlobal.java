package objectorientedconcepts;

public class LocalVsGlobal {
	String text = "aarush";
	int k = 30;
	public static void main(String[] args) {
	
		LocalVsGlobal total = new LocalVsGlobal();
		int total_amount = total.calculator();
		System.out.println(total_amount);
	
	}
	
	public int calculator() {
		int i = 10;
		int j = 20;
		LocalVsGlobal totalprice = new LocalVsGlobal();
		System.out.println(totalprice.text);
		int sum = i+j+totalprice.k;
		return sum;
		
	}

}
