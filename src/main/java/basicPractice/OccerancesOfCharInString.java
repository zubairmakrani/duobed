package basicPractice;

public class OccerancesOfCharInString {
	public static void main(String[] args) {
        String str = "noob";
        int[] charCount = new int[256]; // Assuming ASCII characters

        // Count occurrences of each character in the string
        for (char c : str.toCharArray()) {
            charCount[c]++;
        }

        // Print characters with their counts
        System.out.println("Characters with their counts:");
        for (int i = 0; i < charCount.length; i++) {
            if (charCount[i] > 0) {
                System.out.println((char)i + ": " + charCount[i]);
            }
        }
    }
}
