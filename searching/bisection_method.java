public class bisection_method {
    public static double fungsi(double x){
        return ((10*x) - (0.5*10*(x*x)) - 3);
    }
    public static double sqrt(double x){
        double batasbawah = 0;
        double batasatas = x;
        double nilaitengah;
        do{
            nilaitengah =(batasatas + batasbawah)/2;
            if(fungsi(batasbawah) * fungsi(nilaitengah)>0){
                batasbawah =nilaitengah;
            }else if(fungsi(batasbawah) *fungsi(nilaitengah) < 0){
                batasatas =nilaitengah;
            }
        }while(batasatas - batasbawah > 0.000001);
        return nilaitengah;
    }
    public static void main(String[] args) {
        double hasil = sqrt(1);
        System.out.printf("%.2f",hasil);
    }
}
