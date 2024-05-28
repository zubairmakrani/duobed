package basicPractice;

public class Febo {
	
	public static void main(String[] args) {
		
//		int n0=0; 
//		int n1=1;
//		System.out.print(n0+" "+n1+" ");
//		for(int i=0;i<10;i++) {
//			int temp=n0;
//			n0=n1;
//			n1=n0+temp;
//			int sum=n0+n1;
//			System.out.print(sum+" ");
//		}
		
		System.out.println(fib(6));
		
		
		
	}
	
	public static int fib(int n) {
		if(n == 0 || n == 1) { 
			return n;
		}
		
		int last =  fib(n - 1);
		int secondLast = fib(n - 2);
		
		return last + secondLast;
		
	}

}
