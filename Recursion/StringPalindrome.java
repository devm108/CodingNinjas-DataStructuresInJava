package assignments;
import java.util.Scanner;
public class StringPalindrome {
	public static boolean isStringPalindrome(String input) {
		if (input.length()==0 || input.length()==1) {
			return true;
		}
		if (input.charAt(0) == input.charAt(input.length()-1)) {
			return isStringPalindrome(input.substring(1, input.length()-1));
		}
		 return false;
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String input = s.nextLine();
		System.out.println(StringPalindrome.isStringPalindrome(input));
	}
}
