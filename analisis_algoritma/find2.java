
import java.util.Scanner;
public class find2 {
    public static void main(String[] args) {
        //start
        
        
        

        Scanner sc = new Scanner(System.in);
        //int bnykarr = sc.nextInt();
        int []arr = new int[500000+1];
        for(int i = 1;i<=500000;i++){
            arr[i] = i;

        }

        int bnykkasus = sc.nextInt();
        
        long start = System.nanoTime();

        
        for(int i = 1;i<=bnykkasus;i++){
            int r = sc.nextInt();
            System.out.println(find(arr, r));
        }

        long end = System.nanoTime();
        long time = end-start;
        System.out.println("elapsed time: " + time);


    }
    public static int find(int A[],int r){
        int result = 0;
        int left = 1;
        int right = A.length-1;
        int mid = 0;
        while(left<=right){
            
            mid = ((left+right)/2);
            if(A[mid]==r){
                left = right + 1;
            }else if(A[mid] < r){
                left = mid + 1;
            }else{
                right =mid - 1;
            }
         

        }
        if(A[mid] == r) result = mid;
        return result;
    }
    
}
