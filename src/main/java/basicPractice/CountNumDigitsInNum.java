package basicPractice;

public class CountNumDigitsInNum {
	
	public static int countDigit(int num) {
		int count=0;
		while(num!=0) {
			
			num=num/10;
			count++;
		}
		
		return count;
		
	}
	
	public static void main(String[] args) {
		
		int digits=countDigit(1650465);
		
		System.out.println(digits);
		
	}

}
