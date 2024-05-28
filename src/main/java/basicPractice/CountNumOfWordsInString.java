package basicPractice;

public class CountNumOfWordsInString {
	public static void main(String[] args) {
		
		String s="I love java and java love me";
		
		String []arr=s.split(" ");
		int len=arr.length;
		int count=0;
		
		//System.out.println(len);
		
		for(String ar:arr) {
			for(int i=0;i<len;i++) {
				if(ar.equalsIgnoreCase(arr[i])) {
					count++;
				}
			}
			System.out.println(ar+" : "+count);
			count=0;
		}
		
		
		
	}

}
