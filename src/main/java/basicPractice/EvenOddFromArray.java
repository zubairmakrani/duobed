package basicPractice;

public class EvenOddFromArray {

	public static void main(String[] args) {
		int arr[]= {10,15,20,17,9};
		
		//int len=arr.length;
		
		for(int ar:arr) {
			if(ar%2==0) {
				System.out.println("even: "+ar);
			}
			else
			{
				System.out.println("odd: "+ar);
			}
		}
	}
}
