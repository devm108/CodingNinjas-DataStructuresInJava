package assignments;
import java.util.Scanner;
public class NumZeroes {
	public static int countZerosRec(int input){
		if(input>0){
			if( (input % 10) == 0){
				return countZerosRec(input/10)+1;
			}
			 return countZerosRec(input/10);
		}	
		return 0;
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		System.out.println(NumZeroes.countZerosRec(n));
	}
}
