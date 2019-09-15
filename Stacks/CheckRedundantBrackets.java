import java.util.Stack;
import java.util.Scanner;
public class CheckRedundantBrackets {
	public static boolean checkRedundantBrackets(String input) {
		Stack<Character> st = new Stack<>(); 
		char[] str = input.toCharArray(); 
		
		for (char ch : str) { 

			 
			if (ch == ')') { 
				char top = st.peek(); 
				st.pop(); 

				
				boolean flag = true; 

				while (top != '(') { 

					 
					if (top == '+' || top == '-'
							|| top == '*' || top == '/') { 
						flag = false; 
					} 

					
					top = st.peek(); 
					st.pop(); 
				} 

				
				if (flag == true) { 
					return true; 
				} 
			} else { 
				st.push(ch);  
			}			 
		} 
		return false; 
	} 

	static Scanner s = new Scanner(System.in);

	public static void main(String[] args) {
		String input = s.nextLine();
		System.out.println(CheckRedundantBrackets.checkRedundantBrackets(input));
	}
}
