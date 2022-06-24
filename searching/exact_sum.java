

import java.util.Scanner;
public class exact_sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 0; i < n; i++) {
            int bnykbuku = sc.nextInt();
            int buku[] = new int[bnykbuku];
            for(int j = 0; j < bnykbuku; j++) {
                buku[j] = sc.nextInt();
            }
            int uang = sc.nextInt();
            String hasil[] = hitung(buku,uang);
            for(int k = 0; k < hasil.length; k++) {
                System.out.println(hasil[k]);

            }
            System.out.println();
        }
    }
    private static int cek(int buku[], int uang){
        int kasus = 0;
        for(int i = 0; i < buku.length-1; i++){
            for(int j = i+1; j < buku.length; j++){
                if(buku[i] + buku[j] == uang){
                    kasus++;
                    
                    
                    
                }
            }

        }
        return kasus;

    }

    private static String[] hitung(int buku[],int uang){
        int selisih[] = new int [buku.length];
        String temp[] = new String[buku.length];
        int index = 0;
        boolean temp1 = false;
        int kasus = cek(buku,uang);

        for(int i = 0; i < buku.length-1; i++){
            for(int j = i+1; j < buku.length; j++){
                if(buku[i] + buku[j] == uang){
                    
                    temp1 = true;
                    selisih[index] = Math.abs(buku[i] - buku[j]);
                    if(kasus==1){
                        if(buku[i] < buku[j]){
                            temp[index] =  "Peter harus membeli buku dengan harga " + buku[i] +" dan " +buku[j];
    
                        }else{
                            temp[index] =  "Peter harus membeli buku dengan harga " + buku[j] +" dan " +buku[i];
                        }

                    }else{
                        if(buku[i] < buku[j]){
                            temp[index] =  "Peter dapat membeli buku dengan harga " + buku[i] +" dan " +buku[j];
    
                        }else{
                            temp[index] =  "Peter dapat membeli buku dengan harga " + buku[j] +" dan " +buku[i];
                        }
                        
                    }
                    
                    
                    index++;
                }
            }

        }
        if(temp1 == false){
            temp[index] = "tidak dapat membeli";
        }else{
            int count = 0;
            for(int i = 0;i<temp.length;i++){
                if(temp[i] != null){
                    count++;
                }
            }
             //sorting

             int n = count;
             for(int i = 0;i<n-1;i++){
                 int min = i;
                 for(int j = i+1;j<n;j++){
                     if(selisih[j]>selisih[min]){
                         min = j;
                     }
                 }
                 int temp3 = selisih[min];
                 selisih[min]=selisih[i];
                 selisih[i]=temp3;

                 String temp4 = temp[min];
                 temp[min]=temp[i];
                 temp[i]=temp4;
             }
             String hasil[] = new String [count];
             for(int j = 0;j<count;j++){
                 hasil[j] = temp[j];
             }
             return hasil;
             

        }
        int count = 0;
            for(int i = 0;i<temp.length;i++){
                if(temp[i] != null){
                    count++;
                }
            }
        String hasil[] = new String [count];
        for(int j = 0;j<count;j++){
            hasil[j] = temp[j];
        }
        return hasil;
    }
    
    
}
