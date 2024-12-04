package methodExercises;

public class LargestAmong3Numbers {
	 static int findLargest(int a,int b,int c) {
		 int x = c>(a>b?a:b)?c:((a>b)?a:b);
		 return x;
	 }
	 public static void main(String[] args) {
		int a=3,b=9,c=12,largest;
		largest = findLargest(a,b,c);
		System.out.println("LARGEST AMONG THE GIVEN NUMBERS IS : "+largest);
	}

}
