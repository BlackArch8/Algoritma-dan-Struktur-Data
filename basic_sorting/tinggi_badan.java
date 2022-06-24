
import java.util.Scanner;

public class tinggi_badan {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        int [] array = new int[n];
        for(int i = 0;i<n;i++){
            array[i] = sc.nextInt();

        }
        System.out.println(insertionsort(array));
        

    }
    private static int insertionsort(int []array){
        int n = array.length;
        int total = 0;
        
        for(int i = 0;i<n;i++){
            int j = i-1;
            int key = array[i];
            while(j>=0 && array[j]>key){

                array[j+1] = array[j];
                j--;
                total++;
            }
            array[j+1] = key;
        }
        
        return total;
        
    }
}
    

