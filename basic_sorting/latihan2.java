
import java.util.Scanner;
public class latihan2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        int [] array = new int[n];
        for(int i = 0;i<n;i++){
            array[i] = sc.nextInt();

        }
        int []hasil = insertionsort(array);
        for(int i = 0;i<n;i++){
            System.out.print(hasil[i] + " ");

        }
    }
    private static int[]insertionsort(int []array){
        int n = array.length;
        for(int i = 0;i<n;i++){
            int j = i-1;
            int key = array[i];
            while(j>=0 && array[j]>key){
                

                array[j+1] = array[j];
                j--;
            }
            array[j+1] = key;
        }
        return array;
    }
    
}
