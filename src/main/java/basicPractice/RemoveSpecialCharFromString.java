package basicPractice;

public class RemoveSpecialCharFromString {

	
	
	
	public static void main(String[] args) {
		String s="%&^%@&*$zubari makraniYW&R(Y)";
		
		
		
		System.out.println(s.replaceAll("[^a-zA-Z0-9]",""));
	}
}
