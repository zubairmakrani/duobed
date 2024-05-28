package basicPractice;

public class PalindromeString {
	
	
	public static void palindrome(String s) {
		
		String rev="";
		int len=s.length();
		String org=s;
		
		for(int i=len-1;i>=0;i--) {
			rev=rev+s.charAt(i);
		}
		
		if(org.equals(org)) {
			System.out.println("String is a palindorme: "+org+"   "+rev);
		}
		else {
			System.err.println("String is NOT a palindorme: "+org+"   "+rev);
		}
	}
	
	public static void main(String[] args) {
		palindrome("XEREX");
	}

}
