
import java.util.Scanner;
public class undian {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String wombat[] = new String[n];
        for(int i = 0;i<n;i++){
            wombat[i] = sc.next();
        }
        String pilih = sc.next();
       
        String hasil[] = carinama(wombat,pilih);
        for(int i = 0;i<hasil.length;i++){
            System.out.println(hasil[i]);
        }   
       

    }
    private static int wombathadiah (String[] array,String namadicari){
        for(int i = 0;i<array.length;i++){
            if(array[i].equals(namadicari)){
                return i;
            }
        }
        return -1;
    }
    private static String []carinama(String array[],String namadicari){
        int index = wombathadiah(array,namadicari); 
        String hasilnama[] = new String [3];
        if(index==0){
           hasilnama[0]=array[0];
           hasilnama[1]=array[1];
           hasilnama[2]=array[2];

        }else if(index==array.length-1){
           hasilnama[0]=array[index];
           hasilnama[1]=array[index-1];
           hasilnama[2]=array[index-2];
        }else{
           hasilnama[0]=array[index];
           hasilnama[1]=array[index-1];
           hasilnama[2]=array[index+1];
        }
        int n = hasilnama.length;
        for(int i = 0;i<n-1;i++){
            int min = i;
            for(int j = i+1;j<n;j++){
            
                    if(hasilnama[j].compareTo(hasilnama[min])<0){
                        min = j;
                    }
   
            }
            String temp = hasilnama[min];
            hasilnama[min]=hasilnama[i];
            hasilnama[i]=temp;
        }
        

        return hasilnama;
    }
    
}
