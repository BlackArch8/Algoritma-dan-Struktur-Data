import java.util.Scanner;
public class nama_mahasiswa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String []nama = new String[n];

        for(int i = 0;i<n;i++){
            nama[i] = sc.next();
        }
        String []hasil = urutnama(nama);
        for (int i = 0;i<n;i++){
            System.out.println(hasil[i]);
        }

    }
    private static String []urutnama(String nama[]){
        
        
        int n = nama.length;
        for(int i = 0;i<n-1;i++){
            int min = i;
            for(int j = i+1;j<n;j++){
            
                    if(nama[j].substring(0,2).compareTo(nama[min].substring(0,2))<0){
                        min = j;
                    }

                
                
                
            }
            String temp = nama[min];
            nama[min]=nama[i];
            nama[i]=temp;
        }
        

        return nama;
    }
    
}
