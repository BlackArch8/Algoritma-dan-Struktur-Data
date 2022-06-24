
import java.util.Scanner;
public class no3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 0; i < n; i++) {
            int x = sc.nextInt();
            System.out.printf("%.2f", sqrt(x));
            System.out.println();

        }
        

    }
   
    public static double fungsi(double x,double y){
            return x*x*x-y;
        }
    public static double sqrt(double x){
            double batasbawah = 0;
            double batasatas = x;
            double y = x;
            double nilaitengah;
            do{
                nilaitengah =(batasatas + batasbawah)/2;
                if(fungsi(batasbawah,y) * fungsi(nilaitengah,y)>0){
                    batasbawah =nilaitengah;
                }else if(fungsi(batasbawah,y) *fungsi(nilaitengah,y) < 0){
                    batasatas =nilaitengah;
                }
            }while(batasatas - batasbawah > 0.000001);
            return nilaitengah;
        }
    
}
