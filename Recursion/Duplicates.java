import java.util.Scanner;
public class Duplicates {
	public static String removeConsecutiveDuplicates(String s) {
		if (s.length() <= 1) {
			return s;
		}
		if (s.substring(1,2).equals(s.substring(0, 1))) {
			return removeConsecutiveDuplicates(s.substring(1));
		} else {
			return s.substring(0, 1) + removeConsecutiveDuplicates(s.substring(1));
		}
    }
	static Scanner s = new Scanner(System.in);

	public static void main(String[] args) {
		String input = s.next();
    	System.out.println(Duplicates.removeConsecutiveDuplicates(input));
    }
}
