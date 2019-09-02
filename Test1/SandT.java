import java.util.Scanner;
public class SandT {
	public static boolean checkSequence(String a, String b) {
		if (a.length() < b.length()) {
			return false;
		}
		int j=0;
		for (int i=0; i<a.length(); i++) {
			if (j<b.length() && a.charAt(i)==b.charAt(j)) {
				j++;
			}
		}
		return (j==b.length() ? true:false);
	}
		
	

	public static void main(String[] args) {
		String a, b;
		Scanner s = new Scanner(System.in);
		a = s.nextLine();
		b = s.nextLine();
		System.out.print(SandT.checkSequence(a,b));
	}
}
