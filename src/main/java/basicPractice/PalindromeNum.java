package basicPractice;

public class PalindromeNum {
	
	public static void palindromeNum(int num) {
		
		int org=num;
		int rev=0;
		
		while(num!=0) {
			
			rev=rev*10+num%10;
			num=num/10;
			
		}
		
		if(org==rev) {
			System.out.println("Num is palindrome: "+rev+"   "+org);
		}
		else {
			System.err.println("Num is NOT a palindrome: "+rev+"   "+org);
		}
		
	//	return rev;
		
	}
	
	public static void main(String[] args) {
		
		palindromeNum(53416840);
	}

}
