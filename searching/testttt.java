
import java.util.Scanner; 
public class testttt{
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
               int kanan = 1000000; 
               int temp = 0;
               while (kiri <= kanan) {
                int mid = (kiri + kanan) / 2;
                if (cek(array, container, mid)==false) {
                    kiri = mid + 1;
                } else {
                    kanan = mid - 1;
                    temp = mid;
                    
                }
            }
            System.out.println(temp);

            }
            
        
    }
 
    private static boolean cek(int[] array, int container, int r) {
        int temp =r;
        int kontainer = 1;
        int i = 0;
        while(i<array.length){
            if (array[i] >r)
                return false;
            if (array[i] <= temp)
                temp -= array[i];
            else {
                temp =r - array[i];
                kontainer++;
            }
            i++;

        }
            
        if (kontainer > container)
            return false;
            
        return true;
    }
}