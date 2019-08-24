import java.util.Scanner;
public class ReplaceChar {
	public static String replaceCharacter(String input, char c1, char c2) {
		String output="";
		output=input.replace(c1, c2);
		return output;
	}
		
		
		
//		String output="";
//		output=input.replace(c1, c2);
//		return output;
	

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String input = s.next();
		char c1 = s.next().charAt(0);
		char c2 = s.next().charAt(0);
		System.out.println(ReplaceChar.replaceCharacter(input, c1, c2));
	}
}
