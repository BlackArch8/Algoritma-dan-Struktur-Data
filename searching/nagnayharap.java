
import java.util.Scanner;
public class nagnayharap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String [] input;
        int jumlahElemen = sc.nextInt();
        input = new String [jumlahElemen];
       
        for(int i = 0;i<jumlahElemen;i++){
            input[i] = sc.next();
        }
        int x = sc.nextInt();
        
        for(int i = 0;i<x;i++){
            String namadicari = sc.next();
            int result = searching(input,namadicari);
            System.out.println(result);

        }
        
        
    }



    private static int searching(String []array,String namadicari){
        int kiri = 0;
        int mid = 0;
        int kanan = array.length - 1;
        while(kiri<=kanan){
            mid = (kiri+kanan)/2;
            int res = namadicari.compareTo(array[mid]);
            if(array[mid].equals(namadicari)){
                kiri = kanan+1;
            }
            else if(res < 0 ){
                kiri = mid + 1;
            }
            else{
               kanan= mid -1;
            }
        }
        if(array[mid].equals(namadicari)){
            return mid;
        }else{
            return -1;
        }
    }
    
}
