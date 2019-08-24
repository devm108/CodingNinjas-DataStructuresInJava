package assignments;
import java.util.Scanner;
public class ReplacePi {
	public static String replace(String input){
		String output=" ";
		int n= input.length();
//		for (int i=0; i<n; i++) {
//			if (i + 1 < n && input.charAt(i) == 'p' && input.charAt(i + 1) == 'i') { 
//                output += "3.14"; 
//                i++; 
//            } else {
//            	output += input.charAt(i); 
//            }
//			
//		}
//		return output;
//	}
		output = input.replaceAll("pi", "3.14");
		return output;
	}
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String input = s.nextLine();
		System.out.println(ReplacePi.replace(input));
	}
}
