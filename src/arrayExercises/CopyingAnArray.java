package arrayExercises;

public class CopyingAnArray {
	public static void main(String[] args) {
		
	char[] copyFrom = {'a','b','c','g','o','w','t','h','a','m'};
	char[] copyTo = new char[7];
	System.arraycopy(copyFrom,3,copyTo,0,7);
	System.out.println(String.valueOf(copyTo));
	
/*  char[] copyFrom = {'a','b','a','r','a','n','i'};
	char[] copyTo = new char[6];
	System.arraycopy(copyFrom, 1, copyTo, 0, 6);
	System.out.println(String.valueOf(copyTo));*/
  }
}
