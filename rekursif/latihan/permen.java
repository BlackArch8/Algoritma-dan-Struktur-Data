
import java.util.Scanner;
public class permen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int p_array = sc.nextInt();
        int [] array = new int[p_array];
        for(int i = 0;i<p_array;i++){
            array[i] = sc.nextInt();
        }
        int n = sc.nextInt();
        if(carijumlah(p_array, array, n) == true){
            System.out.println("Y");
        }else{
            System.out.println("N");
        }
        

    }
    private static  boolean carijumlah(int p_array,int []array,int n){
        
        if( n!= 0 &&p_array == 0){
            return false;
        }
        if(n == 0){
            return true;
        }
        if(array[p_array-1]>n){
            return carijumlah(p_array-1, array, n);
        }
        boolean temp = carijumlah(p_array-1, array, n);
        
        if(temp == true){
            return carijumlah(p_array-1, array, n);
        }else {
            return carijumlah(p_array-1, array, n-array[p_array-1]);
        }
        
       

    }
    
}

