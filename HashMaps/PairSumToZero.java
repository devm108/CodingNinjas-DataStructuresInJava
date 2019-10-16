import java.util.*;

public class Solution {
	public static void PairSum(int[] input, int size) {
		
		/* Your class should be named Solution
		 * Don't write main().
		 * Don't read input, it is passed as function argument.
		 * Print the desired output and don't return anything.
	 	 * Taking input is handled automatically.
		 */
        
        for (int i = 0; i < size; i++) {
            for (int j = i + 1; j < size; j++) {
                if (input[i] + input[j] == 0) {
                    if (input[i]<input[j]){
                        System.out.println(input[i]+" "+input[j]);
                    } else {
                        System.out.println(input[j]+" "+input[i]);
                    }
                }
            }
        }
        
    }
	}
