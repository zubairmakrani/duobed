package basicPractice;

import java.util.Arrays;

public class Anagram {
	public static void main(String[] args) {
		String s1="mary";
		String s2="army";
		
		if(s1.length()==s2.length()) {
			
			char [] c=s1.toLowerCase().toCharArray();
			char [] d=s2.toLowerCase().toCharArray();
			
			Arrays.sort(c);
			Arrays.sort(d);
			
			if(Arrays.equals(c, d)) {
				System.out.println("Anagram");
			}
			else {
				System.out.println("not an anagram");
			}
		}
		else {
			System.out.println("not an Anagram");
		}
	}

}
