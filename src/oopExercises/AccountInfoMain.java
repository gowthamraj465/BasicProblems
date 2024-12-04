package oopExercises;

public class AccountInfoMain {
	public static void main(String[] args) {
		AccountInfo myAccount = new AccountInfo();
		myAccount.accountHolder = "GowthamRaj";
		myAccount.accountNumber = 634891236;
		myAccount.balance = 20000.00;
		
		myAccount.deposit(5500.00);
		myAccount.withdraw(5000);
		myAccount.display();
		
	}

}
