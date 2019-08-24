package assignments;
import java.util.Scanner;
public class RetSubset {
	public static int[][] subsets(int input[]) {
		return subsets(input, 0);
	}
	public static int[][] subsets(int input[], int start) {
		if (start == input.length) {
            int[][] myans = new int[1][0];
            return myans;
        }
        int cn = input[start];
        int[][] smallanswer = subsets(input, start + 1);
        int[][] myans = new int[2 * smallanswer.length][];
        int k = 0;
        
        for (int i = 0; i < smallanswer.length; i++) {
            myans[k] = new int[smallanswer[i].length];
            for (int j = 0; j < smallanswer[i].length; j++) {
                myans[k][j] = smallanswer[i][j];

            }
            k++;
        }
        for (int i = 0; i < smallanswer.length; i++) {
            myans[k] = new int[smallanswer[i].length + 1];
            myans[k][0]=cn;
            for (int j = 1; j <= smallanswer[i].length; j++) {
                myans[k][j] = smallanswer[i][j - 1];
            }
            k++;
        }
        
        return myans;
	}
	
	public static int[] takeInput() {
		Scanner s = new Scanner(System.in);
		int size = s.nextInt();
		int arr[] = new int[size];
		for (int i = 0; i < size; i++) {
			arr[i] = s.nextInt();
		}
		return arr;
	}

	public static void main(String[] args) {
		int[] input = takeInput();
		int output[][] = RetSubset.subsets(input);
		for(int i = 0; i < output.length; i++) {
			for(int j = 0; j < output[i].length; j++) {
				System.out.print(output[i][j] + " ");
			}
			System.out.println();
		}
	}
}
