public class faktorial_rekursif {
    public static void main(String[] args) {
        long n = 10;
        System.out.println(faktorial(n));
    }
    private static long faktorial(long n){
        if(n==0){
            return 1;

        }else{
            n *= faktorial(n-1);
            return n;
        }
        
        
        
    }
    
}
