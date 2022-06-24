

import java.util.Scanner;
public class parantheses {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        for(int i = 0;i<n;i++){
            String word = sc.next();
            System.out.println(kata(word.indexOf("("),word));
        }


    }
    private static String kata(int index,String n){
        

        if(n==null||index<0||n.length()<=1){
            return null;
        }
       
        int index2 = n.indexOf(")");
        if(index==index2){
            return ")";
        }
        
        return n.charAt(index)+kata(index+1,n) ;
        
    }


    
}
