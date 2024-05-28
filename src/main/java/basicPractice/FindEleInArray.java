package basicPractice;

public class FindEleInArray {
	public static void main(String[] args) {
		int arr[]= {10,20,30,40,50};
		int tar=50;
		boolean flag=false;
		
		/*
		 * for(int i=0;i<arr.length;i++) {
		 * 
		 * if(arr[i]==tar) { System.out.println("Ele found at index"+i); } }
		 */
		int count=0;
		for(int ar:arr) {
			
			if(ar==tar) {
				System.out.println("Ele found at index: "+count);
				flag=true;
			}
			count++;
			
		}
		if(flag==false) {
			System.out.println("No match found");
		}
		
	}

}
