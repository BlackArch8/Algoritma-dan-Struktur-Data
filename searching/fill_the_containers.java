
import java.util.Scanner; 
public class fill_the_containers{
    public static void main(String[] args) {
        
            Scanner sc = new Scanner(System.in);
            int kasus = sc.nextInt();
            for(int k = 0;k<kasus;k++){
                int wadah = sc.nextInt();
                int container = sc.nextInt();
                int[] array = new int[wadah];
            
                 for (int i = 0; i < array.length; i++) {
                   array[i] = sc.nextInt();
              }
               int kiri = 1; 
               int kanan = Integer.MAX_VALUE; 
               int temp = 0;
               while (kiri <= kanan) {
                int mid = (kiri + kanan) / 2;
                if (cek(array, container, mid)==false) {
                    kiri = mid + 1;
                } else {
                    temp = mid;
                    kanan = mid - 1;
                    
                    
                }
            }
            System.out.println(temp);

            }
            
        
    }
 
    private static boolean cek(int[] array, int container, int r) {
        int temp =r;
        int kontainer = 1;
        int i = 0;
        boolean cektemp = true;
        while(i<array.length){
            
            if (array[i] >r){
                cektemp = false;
               

            }
            if (array[i] <= temp){
                temp -= array[i];

            }
              
            else {
                temp =r - array[i];
                kontainer++;
            }
            i++;

        }
            
        if (kontainer > container){
            cektemp = false;
            return cektemp;

        }
            
            
        return cektemp;
    }
}