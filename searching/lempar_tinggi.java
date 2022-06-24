
import java.util.Scanner;
public class lempar_tinggi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int hasil = sc.nextInt();
        int v = sc.nextInt();
        System.out.printf("%.2f", sqrt(v,hasil));

    }
   
    public static double fungsi(double x,double hasil,double v){
            return ((v*x) - (0.5*10*(x*x)) - hasil);
        }
    public static double sqrt(double x,double hasil){
            double batasbawah = 0;
            double batasatas = x/10;
            double v = x;
            double nilaitengah;
            do{
                nilaitengah =(batasatas + batasbawah)/2;
                if(fungsi(batasbawah,hasil,v) * fungsi(nilaitengah,hasil,v)>0){
                    batasbawah =nilaitengah;
                }else if(fungsi(batasbawah,hasil,v) *fungsi(nilaitengah,hasil,v) < 0){
                    batasatas =nilaitengah;
                }
            }while(batasatas - batasbawah > 0.000001);
            return nilaitengah;
        }
    
    }
    
    

