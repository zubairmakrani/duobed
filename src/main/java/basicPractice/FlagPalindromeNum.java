package basicPractice;

public class FlagPalindromeNum {
	
	public static void main(String[] args) {
		
		int num=121;
		
		int org=num;
		int rev=0;
		
		
		while(num!=0) {
			
			rev=rev*10+num%10;//0*10+5=5---------->num%10----> last ele to capture
			num=num/10;//12345/10=1234------->num/10----> last ele to be removed 
		}
		
		if(org==rev) {
			System.out.println("Palindrome:    "+rev+"  "+org);
		}
		else{
			System.out.println("Not a palindrome:   "+rev+"    "+org);
		}
		
	}

}
