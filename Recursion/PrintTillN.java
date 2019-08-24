import java.util.Scanner;
public class PrintTillN {
	
	public static void print(int n){
		if (n>0) {
			print (n-1);
			System.out.print(n+" ");
		}
		
	}

	
		public static void main(String args[]) {
			Scanner s = new Scanner(System.in);
			int n = s.nextInt();
			PrintTillN.print(n);
		}
		
	}
