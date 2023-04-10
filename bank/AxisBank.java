package bank;

public class AxisBank extends BankInfo{

	public void deposit()
	{
		System.out.println("Deposit rates = 6.3%");
	}
	public static void main(String[] args) {
		AxisBank ab = new AxisBank();
		ab.deposit();
		ab.fixed();
	}

}
