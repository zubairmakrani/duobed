package basicPractice;

public class MaxMinInArray {

	public static void main(String[] args) {
		int arr[]= {11,21,51,42,100,78};
		
		int largest=Integer.MIN_VALUE;
		int secondLargest=Integer.MIN_VALUE;
		
		int smallest=Integer.MAX_VALUE;
		int secondsmallest=Integer.MAX_VALUE;
		
		for(int ar:arr) {
			if(ar>largest) {
				largest=ar;
				
			}
			if(ar<smallest) {
				smallest=ar;
			}
			if(ar>secondLargest && ar!=largest) {
				secondLargest=ar;
			}
			if(ar<secondsmallest && ar!=smallest) {
				secondsmallest=ar;
			}
		}
		System.out.println(largest);
		System.out.println(secondLargest);
		System.out.println(smallest);
		System.out.println(secondsmallest);
	}
}
