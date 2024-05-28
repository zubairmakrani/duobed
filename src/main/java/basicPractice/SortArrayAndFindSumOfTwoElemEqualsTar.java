package basicPractice;

import java.util.Arrays;

public class SortArrayAndFindSumOfTwoElemEqualsTar {
	
	public static void main(String[] args) {
		
		int []a= {1,55,22,15,17,91,35,2};
		
		int target=3;
		int m,n;
		
		/*
		 * Arrays.sort(a);
		 * 
		 * System.out.println(Arrays.toString(a));
		 */
		
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]>a[j]) {
					int temp=a[j];
					a[j]=a[i];
					a[i]=temp;
					
				}
				
			}
			
		}
		System.out.println(Arrays.toString(a));
		
		for(m=0;m<a.length;m++) {
			for(n=1; n<a.length;n++) {
				
				if(a[m]+a[n]==target) {
					int []b= {m,n};
					System.out.println(Arrays.toString(b));
					break;
				}
				
			}
		}
	}

}
