
import java.util.Scanner;
public class kartu_remi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String []kartu = new String[n];
        for(int i =0 ;i<n;i++){
            kartu[i] = sc.next();
        }
        String hasil[] = sortkartu(kartu);
        for(int i = 0;i<kartu.length;i++){
            System.out.print(hasil[i] + " ");
        }
        


    }
    private static String [] sortkartu(String[]kartu){
        
        //s>h>c>d
        int jumlahvalue[] = new int [kartu.length];
        int tempangka[] = new int [kartu.length];
        for(int i = 0;i<kartu.length;i++){
            if(kartu[i].substring(0,1).equals("T")){
                tempangka[i]= 10;

            }else if(kartu[i].substring(0,1).equals("J")){
                tempangka[i]= 11;
            }else if(kartu[i].substring(0,1).equals("Q")){
                tempangka[i]= 12;
            }else if(kartu[i].substring(0,1).equals("K")){
                tempangka[i]= 13;
            }else if(kartu[i].substring(0,1).equals("A")){
                tempangka[i]= 14;
            }else{
                tempangka[i]= Integer.parseInt(kartu[i].substring(0,1));    
            }

        }

        int tempangka2[] = new int [kartu.length];
        for(int i = 0;i<kartu.length;i++){
            if(kartu[i].substring(1,2).equals("s")){
                tempangka2[i]= 1000;

            }else if(kartu[i].substring(1,2).equals("h")){
                tempangka2[i]= 2000;
            }else if(kartu[i].substring(1,2).equals("c")){
                tempangka2[i]= 3000;
            }else if(kartu[i].substring(1,2).equals("d")){
                tempangka2[i]= 4000;
            }
        }
        for(int i = 0;i<kartu.length;i++){
            jumlahvalue[i] = tempangka[i] + tempangka2[i];
        }

        int n = kartu.length;
        for(int i = 0;i<n-1;i++){
            int min = i;
            for(int j = i+1;j<n;j++){
                if(jumlahvalue[j]<jumlahvalue[min]){
                    min = j;
                }
            }
            int temp1 = jumlahvalue[min];
            jumlahvalue[min] = jumlahvalue[i];
            jumlahvalue[i] = temp1;

            String temp = kartu[min];
            kartu[min]=kartu[i];
            kartu[i]=temp;
        }
        return kartu;


    }
    
}
