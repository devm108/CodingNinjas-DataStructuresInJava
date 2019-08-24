package assignments;
import java.util.Scanner;
public class PrintPermutations {
	public static void permutations(String input) {
		permutations("", input);
	}
	public static void permutations(String start, String remain) {
		if (remain.length()==0) {
			System.out.println(start);
		}
		for (int i=0; i<remain.length(); i++) {
			String newStart= start+remain.charAt(i);
			String newRemain= remain.substring(0, i)+remain.substring(i+1);
			permutations(newStart, newRemain);
		}
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String input = s.nextLine();
		PrintPermutations.permutations(input);
	}
}
