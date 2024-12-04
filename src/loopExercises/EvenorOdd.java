package loopExercises;

import java.io.FileInputStream;

public class EvenorOdd {
	/* public static void main(String[] args) {
		int i =1;
		do {
			if (i%2==0) {
				System.out.println(i+"is even");
			}
			else {
				System.out.println(i+"is odd");
			}
			i++;
		}while(i<=100);*/
	public static void main(String[] args) {
		try
		{
			FileInputStream fin=new FileInputStream("abc.txt");
		int i=0;
		while((i=fin.read())!=-1)
		{
			System.out.println((char)i);
		}
		fin.close();
		}
		catch(Exception e) {System.out.println(e);}
		}
	
	
	
			
	}


