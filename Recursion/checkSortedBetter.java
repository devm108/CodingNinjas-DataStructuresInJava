
public class checkSortedBetter {
	public static boolean checkSort(int input[], int startIndex) {
		if (startIndex>=input.length-1) {
			return true;
		}
		if (input[startIndex] > input[startIndex+1]) {
			return false;
		}
		boolean smallAns= checkSort(input, startIndex+1);
		return smallAns;
	} 
	//we don't want user to input the start index
	public static boolean checkSort(int input[]) {
		return checkSort(input, 0);
	}

	public static void main(String[] args) {
		int input[] = {1,2,3,4};
		System.out.println(checkSort(input));

	}

}
