package basicPractice;

public class ReverseString {
	
	public static String reverse(String s) {
		String rev="";
		int len=s.length();
		
		for(int i=len-1;i>=0;i--) {
			
					rev=rev+s.charAt(i);
		}
		
		return rev;
	}
	
	public static void main(String[] args) {
		
		String s="zubaur maktrani";
		
		System.out.println(reverse(s));
		
		
		/*
		 * String str="zubair makrani"; String rev="";
		 * 
		 * int len=str.length();
		 * 
		 * for(int i=len-1;i>=0;i--) { rev=rev+str.charAt(i); }
		 * 
		 * System.out.println(rev);
		 */
	}

}
