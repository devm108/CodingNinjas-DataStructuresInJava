package assignments;
import java.util.Scanner;
public class RetCodes {
	
	public static  String[] getCode(String input){
		if (input.length() == 0) {
            // return new String[0];
            String[] myans = { "" };
            return myans;
        }
        int firstdigit = (input.charAt(0) - '0');
        String[] smallans1 = getCode(input.substring(1));
        String[] smallans2 = new String[0];

        int firsttwodigits = 0;
        if (input.length() >= 2) {
            firsttwodigits = (input.charAt(0) - '0') * 10 + (input.charAt(1) - '0');
            if (firsttwodigits > 10 && firsttwodigits <= 26) {
                smallans2 = getCode(input.substring(2));
            }
        }
        String[] myans = new String[smallans1.length + smallans2.length];
        int k = 0;
        for (int i = 0; i < smallans1.length; i++) {
            char first = getchar(firstdigit);
            myans[k] = first + smallans1[i];
            k++;

        }
        for (int i = 0; i < smallans2.length; i++) {
            char first = getchar(firsttwodigits);
            myans[k] = first + smallans2[i];
            k++;
        }
        return myans;

    }

    public static char getchar(int n) {
        return (char)(96+n);
        
    }
	

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String input = s.next();
		String output[] = RetCodes.getCode(input);
		for(int i = 0; i < output.length; i++) {
			System.out.println(output[i]);
		}
	}
}
