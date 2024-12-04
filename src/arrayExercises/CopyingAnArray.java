package arrayExercises;

public class CopyingAnArray {
	public static void main(String[] args) {
		
	char[] copyFrom = {'a','b','c','g','o','w','t','h','a','m'};
	char[] copyTo = new char[7];
	System.arraycopy(copyFrom,3,copyTo,0,7);
	System.out.println(String.valueOf(copyTo));

}
}