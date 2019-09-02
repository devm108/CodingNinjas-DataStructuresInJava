import java.util.Scanner;
import java.util.Arrays;

public class MaxProfitOnApp {
	public static int maximumProfit(int budget[]) {
		int n= budget.length;
		Arrays.sort(budget);
		int cost[] = new int[n];
		for (int i=0; i<n; i++) {
			cost[i] = budget[i]*(n-i);
		}
		int max = 0;
		for (int i=0; i<n; i++) {
			if (cost[i]>max) {
				max = cost[i];
			}
		}
		return max;
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int input[] = new int[n];
		for(int i=0;i<n;i++)
			input[i] = s.nextInt();
		
		System.out.println(MaxProfitOnApp.maximumProfit(input));
	}

}
