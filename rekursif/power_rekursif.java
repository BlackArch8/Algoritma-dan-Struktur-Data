public class power_rekursif {
    public static void main(String[] args) {
        int a = 3;
        int b = 2;
        System.out.println(power(a, b));
    }
    private static int power(int a,int b){
        if(b ==0){
            return 1;

        }else{
            return a * power(a,b-1);
        }
    }
    
}
