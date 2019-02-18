package oppconcepts;

public interface USbank {
	
	int min_bal = 100;
	
	public void credit();
	public void debit();
	public void tranferMoney();
	
	/*interface: only method declaration
	 * No method body
	 * we can declare the variable and all the variables are static
	 * No static methods in interface
	 * we cannot change the value of the variable
	 * no main method in interface
	 we can not create object for interface
	 interface is bstaract in nature
	 */

}
