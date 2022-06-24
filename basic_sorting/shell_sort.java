
import java.util.Scanner;


public class shell_sort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int []array = new int [n];
        int [] hasil = new int [n];
        for(int i = 0;i<array.length;i++){
            array[i] = sc.nextInt();

        }
      
        
        int n1 = sc.nextInt();
        for(int i = 0;i<n1;i++){
            int bnykshellsort = sc.nextInt();
            hasil = shellsort(array, bnykshellsort);
            for(int j = 0;j<n;j++){
            
                System.out.print(hasil[j] + " ");
                
            }
            System.out.println();
            
            
        }
       
        


    }
    private static int []shellsort(int array[],int H){
        
        for(int i = H;i<array.length;i++){
            int j = i;
            int temp = array[i];
            while (j>=H && array[j-H]>temp){
                array[j] = array[j-H];
                j = j-H;
            } 
            array[j] = temp;

        }
        return array;

    }
    
}
