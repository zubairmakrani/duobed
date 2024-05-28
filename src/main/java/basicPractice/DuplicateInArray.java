package basicPractice;

public class DuplicateInArray {

	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5,2};
		for(int i=0;i<arr.length;i++) {
			for(int j=i + 1;j<arr.length;j++) {
				
				if(arr[j]==arr[i]) {
					System.out.println(arr[i]+" duplicate found "+arr[j]);
				}
			}
		}
	}
}
