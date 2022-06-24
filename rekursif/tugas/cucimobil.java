package tugas;

import java.time.*;
import java.util.Scanner;

public class cucimobil {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String masuk, totaljam ;
        masuk = sc.next();
        totaljam = sc.next();
        double harga = sc.nextDouble();
        int index = totaljam.indexOf(":");
        int jam = Integer.parseInt(totaljam.substring(0, index));
        int menit = Integer.parseInt(totaljam.substring(index+1, totaljam.length()));
    
        int index2 = masuk.indexOf(":");
        int jamMasuk = Integer.parseInt(masuk.substring(0, index2));
        int menitMasuk = Integer.parseInt(masuk.substring(index+1, masuk.length()));
       
        double hargaCuci = ((jam*60) + menit) * harga;
        System.out.println(masuk);
        
        //time 
        if ((menitMasuk + menit) >= 60) {
            LocalTime lt = LocalTime.of((jam + jamMasuk) % 24 + 1, (menit + menitMasuk) % 60 );
            System.out.println(lt);
        } else if ((jamMasuk + jam) >= 24) {
            LocalTime lt = LocalTime.of((jam + jamMasuk) % 24 , (menit + menitMasuk) % 60 );
            System.out.println(lt);
        }
        else {
            LocalTime lt = LocalTime.of((jam + jamMasuk) % 24, menit + menitMasuk);
            System.out.println(lt);
        }
        
        System.out.println(String.format("%.2f", hargaCuci));
        
    }
}