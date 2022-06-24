
import java.util.Scanner;
public class sumdigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 0;i<n;i++){
            int masukan = sc.nextInt();
            System.out.println(sumofdigit(masukan));
        }
        
    }
    
    private static int sumofdigit(int n){
        
        if(n==0){
            return 0;
        }
        int mod = n%10;
        int sisa = n/10;
        
        
        return (mod +sumofdigit(sisa));
    }
    
}
