import java.util.Scanner;

public class Allindex {
	public static int[] allIndexes(int input[], int x, int start) {
		int n=input.length;
		if (start==n) {
			int[] ans= new int[0];
			return ans;
		}
		int[] smallIndex= allIndexes(input, x, start+1);
		if (input[start]==x) {
			int newAns[]= new int[smallIndex.length+1];
			newAns[0]= start;
			for (int i=0; i<smallIndex.length; i++) {
				newAns[i+1]=smallIndex[i];
			}
			return newAns;
		} else {
			return smallIndex;
		}
	}
	public static int[] allIndexes(int input[], int x) {
		return allIndexes(input, x, 0);
		}
		
     static Scanner s = new Scanner(System.in);
	
	public static int[] takeInput(){
		int size = s.nextInt();
		int[] input = new int[size];
		for(int i = 0; i < size; i++){
			input[i] = s.nextInt();
		}
		return input;
	}

	public static void main(String[] args) {
		int[] input = takeInput();
		int x = s.nextInt();
		int output[] = Allindex.allIndexes(input, x);
		for(int i = 0; i < output.length; i++) {
			System.out.print(output[i] + " ");
		}
	}
}

