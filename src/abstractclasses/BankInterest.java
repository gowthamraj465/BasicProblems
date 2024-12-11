package abstractclasses;
abstract class Bank{
	abstract int getRateOfInterest();
	
}
class IndianBank extends Bank{
	int getRateOfInterest() {
		return 7;
	}
}
class StateBank extends Bank{
	int getRateOfInterest() {
		return 8;
	}	
}


public class BankInterest {
	public static void main(String[] args) {
		IndianBank ib =new IndianBank();
		StateBank sbi = new StateBank();
		System.out.println("Rate of Intrest : " +ib.getRateOfInterest()+"%");
		System.out.println("Rate of Intrest : "+sbi.getRateOfInterest()+"%");
	}
	

}
