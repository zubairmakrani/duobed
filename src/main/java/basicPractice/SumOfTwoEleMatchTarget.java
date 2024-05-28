package basicPractice;

public class SumOfTwoEleMatchTarget {
	
	public static void main(String[] args) {
		
		int []a= {1,2,5,7,9,11,12,16,21,24};
		int target=20;
		
	    //int[] ans = new int[2];
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				
				int complement=a[i]+a[j];
				
				if(complement==target) {
					System.out.print(i +","+ j);
					break;
					
					//ans=new int[]{i,j};
				}
			}
			
		}
		
		//System.out.println(Arrays.toString(ans));
	}

}
