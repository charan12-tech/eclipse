package oct_pack;

public class Current_Account extends Account{
	private double overdraft_limit;
	Current_Account(String name, double balance, double overdraft_limit) {
		super(name, balance);
		this.overdraft_limit=overdraft_limit;
	}
	public double getoverdraft_limit()
	{
		return overdraft_limit;
	}
	public void setoverdraft_limit(double overdraft_limit)
	{
		this.overdraft_limit=overdraft_limit;
	}
	public boolean withdraw(double wd_amount) {
        if (getbalance() + overdraft_limit >= wd_amount) {
            setBalance(getbalance() - wd_amount);
            System.out.println("Withdrawal successful. Remaining balance: " + getbalance());
            return true;
        } else {
            System.out.println("Withdrawal not possible. Overdraft limit exceeded.");
            return false;
        }
    }
	public static void main(String[] args) {
	
		 Current_Account ca = new Current_Account("John", 1000, 500);  

	      
	        System.out.println("Initial balance: " + ca.getbalance());

	        boolean success1 = ca.withdraw(800); 
	        System.out.println("Withdraw 800: " + success1);

	      
	        boolean success2 = ca.withdraw(600);  
	        System.out.println("Withdraw 600: " + success2);

	        
	        boolean success3 = ca.withdraw(300);  
	        System.out.println("Withdraw 300: " + success3);

	        System.out.println("Final balance: " + ca.getbalance());

	}

}
