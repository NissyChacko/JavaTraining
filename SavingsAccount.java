public class SavingsAccount
{
	public double balance;

	public SavingsAccount() // non parameterized constructor 
	{
		balance = 0;
		
	}

	public SavingsAccount(double initialBalance)  // parameterized constructor (initialBalance is the parameter)
	{
		balance = initialBalance;
		
	}

	public void deposit(double amount)
	{
		balance = balance + amount;
	}

	public void withdraw(double amount)
	{
		balance = balance - amount;
	}

	
	public double myBalance()
	{
		return balance;
	}

}