package oopExercises;

public class AccountInfo {
	String accountHolder;
	int accountNumber;
	double balance;
	void deposit(double amount) {
		if (amount>0) {
	    balance += amount;
	    System.out.println("DEPOSIT AMOUNT : "+amount);
	} else {
		System.out.println("INVALID DEPOSIT AMOUNT");
	}
	}
	void withdraw(double amount) {
		if (amount>0 && amount<=balance) {
		balance -= amount;
		System.out.println("WITHDRAWL AMOUNT : "+amount);
		}
		else if(amount > balance)
		{ 
			System.out.println("Insuffficient Balnce");
		} 
		else
		{
			System.out.println("INVALID WITHDRAWL AMOUNT");
		}
		
	}
	void display() {
		System.out.println("CURRENT BALANCE : "+balance);
	}
	

}
