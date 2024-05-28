package basicPractice;

public class CharInString {
	
	public static void main(String[] args) {
		
		String s="noob";
		String arr[]=s.split(" ");
		
		int len=arr.length;
		int count=0;
		
		for(String ar:arr) {
			for(int i=0;i<ar.length();i++) {
				char c =ar.charAt(i);
				for(int j=0;j<ar.length();j++) {
					char d=ar.charAt(j);
					if(c==d) {
						count++;
					}
				}
				
				System.out.println(c+"      "+count);
				count=0;
			}
		}
		
		
	}

}
