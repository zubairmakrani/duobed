package basicPractice;

public class LargestofThree {

	public static int Largest(int x,int y, int z) {
		
		int largest=(x>y & x>z)?x:(y>z?y:z);
		
		return largest;
	}
	
	public static void main(String[] args) {
		System.out.println(Largest(110,210,30));
		
	}
}


