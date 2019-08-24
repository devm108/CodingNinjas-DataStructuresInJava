import java.util.Scanner;
public class SumofNaturalNumbers {
	
	public static int sum(int n) {
		if (n==1) {
			return 1;
		}
		return sum(n-1)+n;
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n= s.nextInt();
		System.out.println(sum(n));

	}

}
