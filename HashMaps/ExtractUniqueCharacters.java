import java.util.*;
public class solution {

	public static String uniqueChar(String str){
		// Write your code here
        LinkedHashSet<Character> lhs = new LinkedHashSet<>();
        for (int i=0; i<str.length(); i++){
            lhs.add(str.charAt(i));
        }
        for (Character ch : lhs){
            System.out.print(ch);
        }
        return "";

	}
}
