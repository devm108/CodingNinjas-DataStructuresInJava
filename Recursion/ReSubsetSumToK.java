package assignments;
import java.util.Scanner;
public class ReSubsetSumToK {
	public static int[][] subsetsSumK(int input[], int p) {
		return subsetsSumK(input, p, 0);
		}
	private static int[][] subsetsSumK(int[] input, int p, int start) {
		if (start == input.length) {
            if (p == 0) {
                return new int[1][0];
            }
            else {
                return new int[0][0];
            }
        }
        int cn=input[start];
        int[][] smallans1=subsetsSumK(input, p,start+1);
        int[][] smallans2=subsetsSumK(input, p-cn, start+1);
        
        int[][] myans=new int[smallans1.length+smallans2.length][];
        int m=0;
        for(int i=0;i<smallans1.length;i++){
            myans[m]=smallans1[i];
            m++;
            
        }
        for(int i=0;i<smallans2.length;i++){
            myans[m]=new int[smallans2[i].length+1];
            myans[m][0]=cn;
            for(int j=0;j<smallans2[i].length;j++){
                myans[m][j+1]=smallans2[i][j];
            }
            m++;
        }
        return myans;
        
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
		int output[][] = ReSubsetSumToK.subsetsSumK(input, k);
		for(int i = 0; i < output.length; i++) {
			for(int j = 0; j < output[i].length; j++) {
				System.out.print(output[i][j] + " ");
			}
			System.out.println();
		}
	}
}
