import java.util.Scanner;
public class BalancedParenthesis {
	public static boolean checkBalanced(String exp) {
		StackForParenthesis st=new StackForParenthesis();
        boolean val=false;
        
        for(int i=0;i<exp.length();i++){
           
            if(exp.charAt(i)=='{' || exp.charAt(i)=='[' ||exp.charAt(i)=='('){
                val=false;
                st.push(exp.charAt(i));
            }else if(exp.charAt(i)=='}' || exp.charAt(i)==']' || exp.charAt(i)==')'){
                char c=st.pop();
                
               // System.out.print(c);
                if(c=='x'){
                    return false;
                }
                if(exp.charAt(i)==')'){
                    if(c=='('){
                        val=true;
                        continue;
                    }//if there is any other brackets found set val to false;
                    val=false;
                    break;
                }else if(exp.charAt(i)==']'){
                    if(c=='['){
                        val=true;
                        continue;
                    }
                    val=false;
                    break;
                }else if(exp.charAt(i)=='}'){
                    if(c=='{'){
                        val=true;
                        continue;
                    }
                    val=false;
                    break;
                }
                else{
                    val=false;
                    break;
                }
                
            }
        }
        if(st.top!=null){
            return false;
        }
        return val;
	}
}