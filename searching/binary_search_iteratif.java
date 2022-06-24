import java.util.Scanner;
public class binary_search_iteratif {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] input;
        int jumlahElemen = sc.nextInt();
        input = new int [jumlahElemen];
       
        for(int i = 0;i<jumlahElemen;i++){
            input[i] = sc.nextInt();
        }
        int x = sc.nextInt();
        
        int result = searching(input,x);
        System.out.println(result);
    }



    private static int searching(int []array,int x){
        int kiri = 0;
        int mid = 0;
        int kanan = array.length - 1;
        while(kiri<=kanan){
            mid = (kiri+kanan)/2;
            if(array[mid] == x){
                kiri = kanan+1;
            }
            else if(array[mid] < x ){
                kiri = mid + 1;
            }
            else{
               kanan= mid -1;
            }
        }
        if(array[mid] == x){
            return mid;
        }else{
            return 0;
        }
    }
}



    

