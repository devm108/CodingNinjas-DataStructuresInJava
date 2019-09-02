import java.util.Scanner;
public class SplitArray {
	static Scanner s = new Scanner(System.in);
	static boolean helper(int arr[], int start, int lsum, int rsum){
		int n=arr.length;
		if (start == n) {
	        return lsum == rsum;
		}
		if (arr[start] % 5 == 0) {
	        lsum += arr[start];
		} else if (arr[start] % 3 == 0) {
			rsum += arr[start]; 
		} else {
			return helper(arr, start + 1, lsum + arr[start], rsum) || helper(arr, start + 1, lsum, rsum + arr[start]);
		}
		return helper(arr, start + 1, lsum, rsum); 
	}
	public static boolean splitArray(int input[]) {
		return helper(input, 0, 0, 0); 
	}
 
	

	public static void main(String[] args) {
		int n = s.nextInt();
		int input[] = new int[n];
		for(int i = 0; i < n; i++) {
			input[i] = s.nextInt();
		}
		System.out.println(SplitArray.splitArray(input));

	}

}
