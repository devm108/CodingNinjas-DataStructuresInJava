
public class StackForParenthesis {
NodeForParenthesis top;
    
    public void push(char data){
        NodeForParenthesis newNode=new NodeForParenthesis(data);
        if(top==null){
            newNode.next=null;
            top=newNode;
            return;
        }
        newNode.next=top;
        top=newNode;
    }
  
    public char pop(){
        if(top==null){
           return 'x'; 
        }
        char c= top.data;
        top=top.next;
       // System.out.println(c);
        return c;
    }

}
