package overriding;

public class AxisBank extends BankInfo {
	public void deposit(int dep) {
		System.out.println("The Updated Deposit: " +dep);

	}
	public static void main(String[] args) {
		AxisBank var =new AxisBank();
		var.saving(15000);
		var.fixed(25000);
		var.deposit(30000);

	}

}
