
import java.util.Scanner;
public class PenghitungFaktorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(hitungFaktorial(n));
    }
    public static int hitungFaktorial(int n){
        //base
        if(n==0){
            return 1;

        }
        else{
            return n * hitungFaktorial(n-1);
        }
    }

    
}
