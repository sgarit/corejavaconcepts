package oppconcepts;

public class TestBank {

	public static void main(String[] args) {
		HSBCbank bank = new HSBCbank();
		bank.credit();
		bank.debit();
		bank.educationalLoan();
		bank.tranferMoney();
		System.out.println(USbank.min_bal);

	}

}
