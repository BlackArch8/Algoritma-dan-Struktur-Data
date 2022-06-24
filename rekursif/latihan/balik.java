
import java.util.Scanner;
public class balik {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt() ;
        
         for(int i =1;i<=n;i++){
            String kata = sc.next();
            System.out.println(balikkata(kata));
            
         }


    }
    private static String balikkata(String n){
        if(n.length() == 1 || n==null){
            return n;
        }
        return balikkata(n.substring(1)) + n.charAt(0);
    }
    

    
}
