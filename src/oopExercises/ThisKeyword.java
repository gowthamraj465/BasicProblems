package oopExercises;

public class ThisKeyword {
	int a;
	int b;
	 
 ThisKeyword(int a,int b){
	 this.a=a;
	 this.b=b;	 
 }
  int display () {
	  return a+b;
  }
public static void main(String[] args) {
	ThisKeyword sum = new ThisKeyword(12,28);
	int x = sum.display();
	System.out.println(x);
	
}
}
