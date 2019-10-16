import java.util.HashMap; 
import java.util.Map; 
import java.util.Map.Entry; 
public class Solution {

	public static int maxFrequencyNumber(int[] arr){
		/* Your class should be named Solution
		 * Don't write main().
		 * Don't read input, it is passed as function argument.
		 * Return output and don't print it.
	 	 * Taking input and printing output is handled automatically.
		*/
        int n = arr.length;
        Map<Integer, Integer> hp = new HashMap<Integer, Integer>();
        for (int i=0; i<n; i++){
            int key = arr[i];
            if (hp.containsKey(key)){
                int freq = hp.get(key);
                freq++;
                hp.put(key, freq);
            } else {
                hp.put(key, 1);
            }
        }
		int max_count = 0, res = -1; 
          
        for(int i=0;i<n;i++) 
        { 
            if (max_count < hp.get(arr[i])) 
            { 
                res = arr[i]; 
                max_count = hp.get(arr[i]); 
            } 
        } 
          
        return res;
	}
}
