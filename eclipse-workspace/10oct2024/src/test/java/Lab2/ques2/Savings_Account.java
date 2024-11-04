package Lab2.ques2;

public class Savings_Account extends Account {

	private final double mini_balance=500;
	public Savings_Account(String name, double balance) {
		super(name, balance);
	}
	public boolean withdraw(double wd_amount) {
        if (getbalance() - wd_amount >= mini_balance) {
            setBalance(getbalance() - wd_amount);
            System.out.println("Withdrawal of " + wd_amount + " successful. Remaining balance: " + getbalance());
            return true;
        } else {
            System.out.println("Withdrawal of " + wd_amount + " not possible. Minimum balance requirement of " + mini_balance + " would be violated.");
            return false;
        }
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Savings_Account sa=new Savings_Account("charan",1500);
		System.out.println("Initial Balance"+sa.getbalance());
		sa.withdraw(600);  // Should allow
        System.out.println("After withdrawal, balance: " + sa.getbalance());

        sa.withdraw(800);  // Should not allow because of minimum balance constraint
        System.out.println("Final balance: " + sa.getbalance());

	}

}
