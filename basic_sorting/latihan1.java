

import java.util.Scanner;
public class latihan1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        int [] array = new int[n];
        for(int i = 0;i<n;i++){
            array[i] = sc.nextInt();

        }
        int []hasil = selectionsort(array);
        for(int i = 0;i<n;i++){
            System.out.print(hasil[i] + " ");

        }

    }
    private static int []selectionsort(int []array){
        int n = array.length;
        for(int i = 0;i<n-1;i++){
            int min = i;
            for(int j = i+1;j<n;j++){
                if(array[j]>array[min]){
                    min = j;
                }
            }
            int temp = array[min];
            array[min]=array[i];
            array[i]=temp;
        }
        return array;
        
    }
    
}
