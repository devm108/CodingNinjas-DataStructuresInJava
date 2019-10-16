import java.util.*;
public class Intersection{
	
	public static void intersection(int[] arr1, int[] arr2){
		/* Your class should be named Intersection
		 * Don't write main().
		 * Don't read input, it is passed as function argument.
		 * Print output and don't return it.
	 	 * Taking input is handled automatically.
  		 */
        if(arr1.length==0 || arr2.length==0){
            return;
        }
        Map<Integer,Integer> mp=new HashMap<>();
        for(int i=0;i<arr1.length;i++){
            if(mp.containsKey(arr1[i]))
                mp.put(arr1[i],mp.get(arr1[i])+1);
            else
                mp.put(arr1[i],1);
        }
        for(int i=0;i<arr2.length;i++){
            if(mp.containsKey(arr2[i]) && mp.get(arr2[i])!=0){
                System.out.println(arr2[i]);
                mp.put(arr2[i],mp.get(arr2[i])-1);
                
            }
            
        }
    } 
}
