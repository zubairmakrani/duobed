package basicPractice;

public class SwapNum {
	
	public static void swap(int a,int b) {
		
		//approach1 using third var
		/*
		 * System.out.println("Before swap: "+a+"    "+b); int c=a; a=b; b=c;
		 * 
		 * System.out.println("After swap: "+a+"    "+b);
		 */
		
		//approach2 using arithmetic operators
		System.out.println("Before swap: "+a+"    "+b);
		/*
		 * a=a+b; b=a-b; a=a-b;
		 */
		/*
		 * a=a*b; b=a/b; a=a/b;
		 */
		
		//approach 3 expression
		
		b=a+b-(a=b);
		
		System.out.println("After swap: "+a+"    "+b);
	}
	
	public static void main(String[] args) {
		
		swap(10,20);
		
	}

}
