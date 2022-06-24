
import java.util.Stack;
public class Stack_java {
    public static void main(String[] args) {
        Stack<Integer> myStack = new Stack<Integer>(); 
        myStack.push(5);
        myStack.push(3);
        // System.out.println(myStack.peek());
        // System.out.println(myStack.pop());
        //  System.out.println(myStack.empty());
        //  System.out.println(myStack.pop());
        // System.out.println(myStack.empty());
        
        boolean hasil = false;
        if(myStack.pop().equals(myStack.peek())){
            hasil = true;
        }
        
        System.out.println(hasil);
    }
    
}
