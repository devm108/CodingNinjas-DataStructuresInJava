import java.util.Scanner;

public class LastIndex {
	public static int lastIndex(int input[], int x, int last) {
		int n=input.length;
		if (last==n) {
			return -1;
		}
		int index= lastIndex(input, x, last+1);
		if (index==-1 && input[last]==x ) {
			return last;
		} else {
			return index;
		}
	}
	
	public static int lastIndex(int input[], int x) {
		return lastIndex(input, x, 0);
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
		System.out.println(LastIndex.lastIndex(input, x));
	}
}
