package assignments;

import java.util.Scanner;

public class PrintSubsets {
	public static void printSubsets(int input[]) {
		int[] output = new int[0];
        printSubsets(input, 0,output);
	}
	public static void printSubsets(int[] input, int start,int[] output) {
        if (start == input.length) {
            for (int i = 0; i < output.length; i++) {
                System.out.print(output[i] + " ");
            }
            System.out.println();
            return;

        }
        int[] newoutput = new int[output.length + 1];
        int i = 0;
        for (; i < output.length; i++) {
            newoutput[i] = output[i];
        }
        newoutput[i] = input[start];
        printSubsets(input, start + 1, output);
        printSubsets(input, start + 1, newoutput);
        
        
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
		PrintSubsets.printSubsets(input);
	}
}
