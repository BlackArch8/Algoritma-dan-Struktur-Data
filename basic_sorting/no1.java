
import java.util.Scanner;
public class no1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int bnykbuku = sc.nextInt();
        int [] panjang = new int[bnykbuku];
        int [] tebal = new int [bnykbuku];
        String [] kata = new String[bnykbuku];
        for(int i = 0; i <bnykbuku;i++){
            panjang[i] = sc.nextInt();
            tebal[i] = sc.nextInt();
            kata[i] = sc.next();
        }
        sortnama(panjang, tebal, kata);
        
    }
    private static void sortnama(int []array,int []tebal,String kata[]){
        
        int n = array.length;
        for(int i = 0;i<n-1;i++){
            int min = i;
            for(int j = i+1;j<n;j++){
                if(array[j]>array[min]){
                    min = j;
                }else if(array[j]==array[min]){
                    if(tebal[j]>tebal[min]){
                        min = j;
                }else if(array[j]==array[min] && tebal[j]==tebal[min]){
                    if(kata[j].compareTo(kata[min])<0){
                        min = j;
                    }
                }
                
            }
            int temp = array[min];
            array[min]=array[i];
            array[i]=temp;

            int temp1 = tebal[min];
            tebal[min]=tebal[i];
            tebal[i]=temp1;

            String temp2 = kata[min];
            kata[min]=kata[i];
            kata[i]=temp2;
        }
       
        
        
        
        
    }
    for(int i = 0; i < array.length;i++){
        System.out.println(kata[i]);
    }
}
}
    


