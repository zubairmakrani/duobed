package basicPractice;

import java.util.Arrays;

public class SortArray {
public static void main(String[] args) {
	int ar[]= {10,9,12,7,15,5};
	
	
	System.out.println("before sort"+Arrays.toString(ar));
	
	/*
	 * Arrays.sort(ar);
	 * 
	 * System.out.println("before sort"+Arrays.toString(ar));
	 */
	
	for(int i=0; i<ar.length;i++) {
		
		for(int j=i+1;j<ar.length;j++) {
			if(ar[i]>ar[j]) {
				/*
				 * ar[i] = ar[i]+ ar[j]; ar[j]=ar[i]- ar[j]; ar[i]=ar[i]- ar[j];
				 */
				
				ar[j]=ar[i]+ar[j]-(ar[i]=ar[j]);
			}
		}
		/*
		 * if(ar[i]>ar[i+1]) { int temp=ar[i]; ar[i]=ar[i+1]; ar[i+1]=temp; }
		 */
		
	}
	System.out.println("before sort"+Arrays.toString(ar));
}
}
