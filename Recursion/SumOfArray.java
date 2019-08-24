import java.util.Scanner;
public class SumOfArray {
	public static int sum(int input[]) {
		int sum=0;
		int n=input.length;
		if (n<=0) {
			return 0;
		}
		int smallInput[]=new int[input.length-1];
		for (int i=1; i<input.length; i++) {
			smallInput[i-1]=input[i];
		}
		sum = sum(smallInput)+input[0];
		return sum;
	}
	
	
	
	static Scanner s = new Scanner(System.in);

	public static void main(String[] args) {
		int n = s.nextInt();
		int input[] = new int[n];
		for(int i = 0; i < n; i++) {
			input[i] = s.nextInt();
		}
		System.out.println(SumOfArray.sum(input));
	}
}
