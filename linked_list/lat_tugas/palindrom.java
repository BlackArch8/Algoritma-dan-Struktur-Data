
import java.util.Scanner;
import java.util.Stack;
public class palindrom {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i = 0;i<n;i++){
            String kata = sc.next();
            System.out.println(cekpalindrom(kata)); 
        }
    }
    private static boolean cekpalindrom(String kata){
        Stack stack = new Stack ();
        for(int i = 0;i<kata.length();i++){
            stack.push(kata.charAt(i));


        }
        String res = "";
        while (!stack.isEmpty()){
            res += stack.pop();
        }
        if(res.equals(kata)){
            return true;
        }else{
            return false;
        }
        
    }
    
}
