public class SavingsAccountTester
{
	public static void main(String[] args)
	{
		//SavingsAccount mySavings = new SavingsAccount();
		//System.out.println("My initial Balance is:  "+ mySavings.myBalance());	

		//mySavings.deposit(7000);
		//System.out.println("My Balance after deposit 7000: "+ mySavings.myBalance());

		SavingsAccount mySavings = new SavingsAccount(7000);	//calling parameterized constructor	
        System.out.println("My Balance is=  "+ mySavings.myBalance());

		mySavings.withdraw(2000); //calling method withdraw()	
		System.out.println("My Balance after withdraw amount 2000 is =  " + mySavings.myBalance());	

		mySavings.deposit(7000); //calling method deposit()
		System.out.println("My Balance after deposit 7000 is =  "+ mySavings.myBalance());
		

		
	
	}

}