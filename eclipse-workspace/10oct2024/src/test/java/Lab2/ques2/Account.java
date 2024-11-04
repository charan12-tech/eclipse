package Lab2.ques2;

public class  Account{
	private String name;
	private double balance;
	
	Account(String name,double balance)
	{
		this.balance=balance;
		this.name=name;
	}
	
	public void deposit(double dp_amount)
	{
		balance += dp_amount;
		System.out.println("your deposit amount"+dp_amount+"is deposited successfully\nCurrent balance is "+balance);
	}
	public double getbalance()
	{
		return balance;
	}
	public void setBalance(double balance) {
        this.balance = balance;
    }
	public boolean withdraw(double wd_amount) {
        if (balance >= wd_amount) {
            balance -= wd_amount;
            System.out.println("Amount " + wd_amount + " is debited from your account.\nCurrent balance is " + balance);
            return true;
        } else {
            System.out.println(name + " tried to withdraw " + wd_amount + " but insufficient balance. Current Balance: " + balance);
            return false;
        }
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account ac1= new Account("Smith",2000);
		Account ac2=new Account("Kathy",3000);
		System.out.println(ac1.getbalance());
		ac1.deposit(200);
		ac1.withdraw(430);
		System.out.println(ac1.getbalance());
		System.out.println(ac2.getbalance());
		ac2.withdraw(280);
		ac2.deposit(3546);
		System.out.println(ac2.getbalance());
		

	}

}


