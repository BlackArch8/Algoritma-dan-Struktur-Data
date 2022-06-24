package tugas;
import java.util.Scanner;

public class happy_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int idxangka = 1;
        for (int i = 0;i<n;i++){
            int angka = sc.nextInt();
            boolean hasil = (happynunber(angka));
            if(hasil){
                System.out.println("Case #" + idxangka + ": "+ angka + " is a Happy number.");
            }else{
                System.out.println("Case #" + idxangka + ": "+ angka + " is an Unhappy number.");
            }
            idxangka++;
        }
    }

    public static boolean happynunber(int angka){
        int s = 0;
        if(angka<10){
            int temp = (int) Math.pow(angka,2);
        
       
        while(temp!=0){
            int mod = temp % 10;
            s += Math.pow(mod, 2);
            
            
           
            temp /= 10;
        }
        }else{
            s = angka;
        }
        
        
        if(s == 1){
            return true;
        }else{
            while(s>=10){
                int stemp = 0;

                while(s!=0){
                    int mod = s % 10;
                    stemp += Math.pow(mod,2);

                    s /= 10;

                }
                s = stemp;


            }
            return s == 1;
           
            
            
        }



    }
    
}
