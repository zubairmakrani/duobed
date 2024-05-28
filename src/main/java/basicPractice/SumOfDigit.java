package basicPractice;

public class SumOfDigit {
	
	public static void main(String[] args) {
		
		int num=125157;
		
		int digit=0;
		int sum=0;
		while(num!=0) {
			digit=num%10;
			num=num/10;
		
			
			sum=sum+digit;
		}
		System.out.println(sum);
	}

}
