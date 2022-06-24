package quiz;
import java.util.Scanner;
public class quiz {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int n = sc.nextInt();
       int []array = new int[n];
       for(int i = 0;i<n;i++){
            array[i] = sc.nextInt();
            
       } 
       
       if(splitOdd10(n-1, array) == true){
         System.out.println("bisa");
        }else{
        System.out.println("tidak bisa");
    }
    }
    public static boolean splitOdd10(int n, int []array){
        int sum = 0;
       
        if(n==0){
            
            if(sum%2!=0){
                return true;
    
            }else{
                return false;
            }
        }
            
        if(array[n]%10 == 0){
            
            splitOdd10(n-1, array);
        }else{
            sum += array[n];
            splitOdd10(n-1, array);
        }
        

        
        
        

    }
    
}
