package inheritance;
class BankAccount{
  public String accountNumber;
  public double balance;
  
  public BankAccount(String accountNumber,double balance) {
	  this.accountNumber = accountNumber;
	  this.balance = balance;
  }
   
  public void deposit(int amount) {
	  balance += amount;	  
  }
  public void withdraw(int amount) {
	  if (amount<=balance) {
		  balance -= amount;
	  }
	  else {
		  System.out.println("INSUFFICIENT BALANCE");
	  }
  }
	  public void getBalance() {
		 System.out.println("AVAILABLE BALANCE : "+ balance);
	  }
  
}
class SavingsAccount extends BankAccount {
	public SavingsAccount(String accountNumber,int balance) {
		super(accountNumber,balance);
	}
	public void withdraw(int amount) {
	if (balance-amount < 100) {
		System.out.println("MINIMUM BALANCE OF RS.100/- IS REQUIRED");
	}else {
		super.withdraw(amount);
	}
			
	
	}
	
}
public class AccountDetails {
	public static void main(String[] args) {
		BankAccount acInfo = new BankAccount("BA1234",5000);
		acInfo.getBalance();
		acInfo.deposit(500);
		acInfo.getBalance();
		acInfo.withdraw(2500);
		System.out.println("AVAILABLE BALANCE AFTER WITHDRAWING : "+acInfo.balance);
		SavingsAccount SA_acInfo = new SavingsAccount("SA09876",7500);
		System.out.println("CURRENT BALANCE : "+SA_acInfo.balance);
		SA_acInfo.deposit(2000);
		System.out.println("AVAILABLE BALANCE AFTER DEPOSIT : "+SA_acInfo.balance);
		SA_acInfo.withdraw(8450);
		SA_acInfo.getBalance();
		
		
	}
}
	


