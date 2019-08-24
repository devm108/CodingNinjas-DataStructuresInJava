package assignments;
import java.util.Scanner;
public class ReplaceX {
	public static String removeX(String input){
		if (input.length()==0) {
			return input;
		}
		String ans="";
		if (input.charAt(0) != 'x') {
			ans = ans + input.charAt(0);
		}
		String smallAns= removeX(input.substring(1));
		return ans+smallAns;
		
		
		
//		String output="";
//		output= input.replaceAll("x", "");
//		return output;
		
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String input = s.nextLine();
		System.out.println(ReplaceX.removeX(input));
	}
}
