import java.util.Scanner;
public class CheckArrayNum {
	public static boolean checkNumber(int input[], int x) {
		int n=input.length;
		if (n==0) {
			return false;
		}
		if (input[0]==x) {
			return true;
		} 
		
		int smallInput[]= new int[n-1];
		for (int i=1; i<input.length; i++) {
			smallInput[i-1]=input[i];
		}
		boolean check = checkNumber(smallInput, x);
		return check;
		
	}
	
	
	static Scanner s = new Scanner(System.in);

	public static void main(String[] args) {
		int n = s.nextInt();
		int input[] = new int[n];
		for(int i = 0; i < n; i++) {
			input[i] = s.nextInt();
		}
		int x = s.nextInt();
		System.out.println(CheckArrayNum.checkNumber(input, x));
	}
}
