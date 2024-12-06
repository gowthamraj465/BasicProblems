package basicProblems;

public class GettersSetters {
	private String txt;
	private int num;
	public char grade;
	 
	public String getValue() {
		return txt;		
	}
	public int getNumber() {
		return num;
	}
	
	public void setValue(String name,int num) {
		this.txt=name;
		this.num = num;
	}
	public void display() {
		 System.out.println("NAME : "+txt);
		 System.out.println("AGE :"+num);
		 System.out.println("GRADE : "+grade);
	}
		 
	 }
	 
	


