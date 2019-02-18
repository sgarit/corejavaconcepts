package oppconcepts;

public class HSBCbank implements USbank,BrazilBank {

	public void credit() {
		System.out.println("hsbc:credit");
	}
	public void debit() {
		System.out.println("hsbc:debit");	
		}
	public void tranferMoney() {
		System.out.println("hsbc:transfer money");
	}
	public void educationalLoan() {
		System.out.println("hsbc:edu loan");
	}
	public void carLoan() {
		System.out.println("hsbc:car loan");
	}
	public void mutualFunds() {
		System.out.println("hsbc:car loan");
	}
	
}
