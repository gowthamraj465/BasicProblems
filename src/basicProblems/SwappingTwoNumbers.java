package basicProblems;

public class SwappingTwoNumbers {
	public static void main(String[] args) {
		int a = 15;
		int b = 25;
  System.out.println("Before Swapping \nvalue of a:"+a );
  System.out.println("Value of b :"+b);
  //METHOD1//
  /*int temp = a;
  a = b;
  b= temp;*/
  
  //METHOD2//
  /*a=a+b;
  b=a-b;
  a=a-b;*/
  
  //METHOD3//
  /*a=a*b;
  b=a/b;
  a=a/b;*/
  
  //METHOD 4//
  b=a+b-(a=b);
  
  System.out.println("After Swapping \nvalue of a:"+a);
  System.out.println("value of b :"+b);
  
  
	}

}
