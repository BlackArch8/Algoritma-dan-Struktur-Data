
import java.util.Scanner;
public class waktu_eksekusi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        
        long start;
        long end;
        long waktuproses;
        bilangan_prima prime = new bilangan_prima();
        start = System.currentTimeMillis();
        String result = prime.print_prime(n);
        end = System.currentTimeMillis();
        waktuproses = end - start;
        System.out.println(result);
        System.out.println(waktuproses);

        
    }
    public static String print_prime(int n){
        String result = "";
        for( int i = 2;i<=n;i++){
            boolean isPrime = true;
            int j = 2;
            
            while (isPrime==true && j<=Math.sqrt(i)){
                if (i%j==0){
                    isPrime = false;
                }
                else{
                    j++;
                }
                
            }
            if (isPrime ==true){
                result = result + i + " ";

            }
            

        }
        return result;

    }
    
}
