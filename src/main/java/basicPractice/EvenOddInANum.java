package basicPractice;

public class EvenOddInANum {
	
	public static void main(String[] args) {
		int num=54164165;
		int last=0;
		
		while(num!=0) {
			
			last=num%10;
			num=num/10;
			
			if(last%2==0) {
				System.out.println("The digit is Even: "+last);
			}
			else {
				System.out.println("The digit is Odd: "+last);
			}
			
			
		}
	}
	
	
	

}
