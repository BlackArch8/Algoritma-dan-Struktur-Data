

import java.math.BigInteger;
import java.util.Scanner;
public class decimal_binary{
 public static void main(String[] args) {
  
  Scanner sc = new Scanner(System.in);
  int n = sc.nextInt();
  for(int i = 0;i<n;i++){
     
        String masukan = sc.next();
        masukan_convert = new BigInteger (masukan);
        System.out.println(konversi(masukan_convert));
 
  }
  
 }
    //memakai kelas BigInteger agar dapat menampung angka yang lebih besar dari kapasitas long

    static BigInteger masukan;
    static BigInteger decimal_num;
    static BigInteger base;
    static BigInteger masukan_convert;

    public static BigInteger konversi(BigInteger angka){
        BigInteger rem;
        if(angka.equals(masukan_convert)){
            decimal_num =new BigInteger("0");
            base= new BigInteger("1");
        }
        BigInteger b = new BigInteger("0");
        if(angka.compareTo(b) ==1){
        BigInteger mod = new BigInteger("10");
        rem = angka.mod(mod); 
        decimal_num = decimal_num.add(rem.multiply(base));  

        angka = angka.divide(mod);
        BigInteger kali = new BigInteger("2");
        base = base.multiply(kali);  
        konversi(angka);
        }
        return(decimal_num);
    }
}
