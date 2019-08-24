import java.util.Scanner;
public class QuickSort {
	public static void quickSort(int[] input) {
		quickSort(input, 0, input.length-1);
	}
	
	public static void quickSort(int[] input, int si, int ei) {
		if (si>=ei) {
			return;
		}
		int pivotPos= partition(input, si, ei);
		quickSort(input, si, pivotPos-1);
		quickSort(input, pivotPos+1, ei);
	}
	
	public static int partition(int input[], int si, int ei) {
		int count=0;
		int pivotPos= input[ei];
		int i= si-1;
		for (int j= si; j<ei; j++) {
			if (input[j]<=pivotPos) {
				i++;
				int temp= input[i];
				input[i]=input[j];
				input[j]=temp;
			}
		}
		int temp = input[i+1]; 
        input[i+1] = input[ei]; 
        input[ei] = temp; 
  
        return i+1;
		
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
		QuickSort.quickSort(input);
		for(int i = 0; i < input.length; i++) {
			System.out.print(input[i] + " ");
		}
	}
}
