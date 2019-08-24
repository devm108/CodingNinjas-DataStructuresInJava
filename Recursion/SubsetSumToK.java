package assignments;
import java.util.Scanner;
public class SubsetSumToK {
	public static void printSubsetsSumTok(int input[], int k) {
		int[] output=new int[0];
        printSubsetsSumTok(input, k, 0,output);

	}
	public static void printSubsetsSumTok(int[] input, int k, int start,int[] output) {
        if (start == input.length) {
            if (k == 0) {
                for (int i : output) {
                    System.out.print(i + " ");
                }
                System.out.println();
                return;
            }
            else {
                return;
            }

        }
        int[] newoutput = new int[output.length + 1];
        int i = 0;
        for (; i < output.length; i++) {
            newoutput[i] = output[i];

        }
        newoutput[i] = input[start];
        printSubsetsSumTok(input, k, start + 1, output);
        printSubsetsSumTok(input, k-input[start], start+1, newoutput);

        
    }
	static Scanner s = new Scanner(System.in);
	public static int[] takeInput() {
		int size = s.nextInt();
		int arr[] = new int[size];
		for (int i = 0; i < size; i++) {
			arr[i] = s.nextInt();
		}
		return arr;
	}

	public static void main(String[] args) {
		int[] input = takeInput();
		int k = s.nextInt();
		SubsetSumToK.printSubsetsSumTok(input, k);
	}
}
