public class fibonaci_rekursif{
    public static void main(String[] args) {
        int n = 4;
        System.out.println(fibonaci(n));
    }
    private static int fibonaci(int n){
        if(n == 1 || n==0){
            return n;
        }
        else{
            return fibonaci(n-1) + fibonaci(n-2);

        }
    }
}