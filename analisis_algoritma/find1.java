

import java.util.Scanner;
public class find1{
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        //int bnykarr = sc.nextInt();
        int bnykarr = 500000;
        int []arr = new int[bnykarr];
        for(int i = 0;i<bnykarr;i++){
            arr[i] = i;

        }

        int bnykkasus = sc.nextInt();
        long start = System.nanoTime();
        
        for(int i = 0;i<bnykkasus;i++){
            int r = sc.nextInt();
            System.out.println(find(arr, r));
        }
        long end = System.nanoTime();
        long time = end-start;
        System.out.println("elapsed time: " + time);



    }
    private static int find(int A[],int r){
        int result = 0;
        int i = 0;
        int n = A.length;
        while(i<n && result ==0){
            if(A[i]==r){
                result = i + 1;
            }
            i ++;

        }
        return result;
    }
}
