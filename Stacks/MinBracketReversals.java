import java.util.Scanner;
import java.util.Stack;
public class MinBracketReversals {
	public static int countBracketReversals(String input){
		int len = input.length();
		if (len%2 != 0) {
			return -1;
		}
		Stack<Character> st = new Stack<>();
		for (int i=0; i<len; i++) {
			char c = input.charAt(i);
			if (c == '}' && !st.isEmpty()) {
				if (st.peek() == '{') {
					st.pop();
				} else {
					st.push(c);
				}
			} else {
				st.push(c);
			}
		}
			int redLen = st.size();
			int n = 0;
			while (!st.isEmpty() && st.peek() == '{') {
				st.pop();
				n++;
			}
		
		return (redLen/2 + n%2);
	}
	
	static Scanner s = new Scanner(System.in);

	public static void main(String[] args) {
		String str = s.nextLine();
		System.out.println(MinBracketReversals.countBracketReversals(str));

	}

}
