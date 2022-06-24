
import java.util.Scanner;
public class BarisanKelinci {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        System.out.println(barisan(n));

    }
    private static  int barisan(int n){
        
        if(n==0){
            return 0;
        }
        //rumus deret aritmatika
        int un = 7 + (n-1)*3;
        
        return (un + barisan(n-1));
    }
}

