
import java.util.Scanner;
public class CariNilaiMaxRek {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int []arr = new int [size];
        for(int i = 0;i<size;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(max_arr(arr,size-1));

    }
    public static int max_arr(int A[],int n){
        if(n==0){
            return A[0];

        }else{
            int t = max_arr(A,n-1);
            if(t>A[n]){
                return t;

            }else{
                return A[n];
            }
        }
    }
    
}
