
import java.util.Scanner;
public class tim_kompetisi {
    public static void main(String[] args) {
       Scanner sc = new Scanner (System.in);
       int n = sc.nextInt();
       for(int j = 0;j<n;j++){
        int kelompok = sc.nextInt();
        int array[] = new int[kelompok*3];
        for(int i = 0;i<array.length;i++){
            array[i] = sc.nextInt();
        }
        nilaitertinggi(array, kelompok);
       }
       

    }
    private static void nilaitertinggi(int [] array,int kelompok){
        int index, indexlooping = 0;
        int total = 0;
        int count = 0;
        int panjangarray = array.length;
        int n = panjangarray/kelompok;

        for(int k = 0;k<kelompok;k++){
            
            int indexpertama = count;
            int indexkedua = count + 2;
            for(int i = indexlooping;i<n-1;i++){
                int min = i;
                for(int j = i+1;j<n;j++){
                    if(array[j]<array[min]){
                        min = j;
                    }
                }
                int temp = array[min];
                array[min]=array[i];
                array[i]=temp;
            }
            n +=3;
            count  = indexkedua+1;
            index = (indexpertama + indexkedua)/2;
            indexlooping +=3; 
            total += array[index];
           
            
            
            
        }
        System.out.println(total);
       
        
        
       


        
    }
}
