import java.util.Scanner;
public class Stars {
	
	public static String addStars(String s) {
        
		 return helper(s,0);

	}
   
   public static String helper(String s,int i) {
       String output = "";
		if (i == s.length() ) {
	        return output;
		} 
       if (i == s.length() -1 ) {
	        return output + s.charAt(i);
		} 
       output = output + s.charAt(i);
		if (s.charAt(i) == s.charAt(i+1)) {  
		       output = output + '*';      
		}
		
		 output = output + helper(s, i+1);
		 return output;

	}
	
	
	
	

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String input = s.nextLine();
		System.out.println(addStars(input));
		
	}
}

