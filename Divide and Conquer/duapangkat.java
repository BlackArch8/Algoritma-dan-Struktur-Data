
import java.math.BigInteger;
import java.util.Scanner;

public class duapangkat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            
            BigInteger d = BigInteger.valueOf(b);
            BigInteger p = new BigInteger("2");
            BigInteger e = p.pow(a);
            BigInteger l = p.modPow(e, d);

            System.out.println(l);

        }

    }

}
