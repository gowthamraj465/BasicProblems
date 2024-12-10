package inheritance;
class Bicycle {
	public int gear;
	public int speed;
	 
	public Bicycle(int gear,int speed) {
		this.gear = gear;
		this.speed = speed;
	}
	public void applyBrake(int decreament) {
		speed -= decreament;
	}
	public void speedUp(int increament) {
		speed += increament;
		
	}
	public String toString() {
		return ("NO. of Gear : "+gear+" \n Speed of the Bicycle : "+speed);
	}
}
class MountainBike extends Bicycle {
	public int seatHeight ;
	
	public MountainBike(int gear , int speed ,int seatHeight) {
		super(gear,speed);
		this.seatHeight = seatHeight;
	}
	 public void setHeight(int newValue) {
		 seatHeight += newValue;
	 }
	 public String toString() {
		return (super.toString()+"\n SeatHeight : "+seatHeight);
	}
	
}


public class MAIN {
	public static void main(String[] args) {
		MountainBike obj = new MountainBike(5,75,800);
			obj.applyBrake(18);
			obj.speedUp(25);
			obj.setHeight(20);
			String status = obj.toString();
			System.out.println(status);
		
		
	}

}
