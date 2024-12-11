package interfaceExercises;
interface Accounts{
	void deposit(double amount);
	void withdraw(double amount);
	double getBalance();
}
class SavingsAccount implements Accounts{
	private double balance;
	private double intrestRate;
	public SavingsAccount( double balance , double intrestRate ) {
	this.balance = balance;
	this.intrestRate = intrestRate;
}
	public void deposit(double amount) {
		balance += amount;
	}
	public void withdraw(double amount)	{
		if(amount<=balance) {
			balance -= amount;
		}else {
			System.out.println("Insufficient Balance");
		}
	}
	public double getBalance() {
		
		return balance;
		
	}
	public void applyIntrest() {
		balance += ((balance*intrestRate)/100);
	}
}

	

public class AccountsInfo {
	public static void main(String[] args) {
		SavingsAccount acc = new SavingsAccount(10000,20);
		acc.deposit(500);
		acc.withdraw(2500);
		acc.applyIntrest();
		System.out.println("AVAILABLE BALANCE IS "+acc.getBalance());
	}

}
	
	