public class multiply_rekursif {
    public static void main(String[] args) {
        int a = 10;
        int b = 0;
        System.out.println(kali(a, b));
    }
    private static  int kali(int a,int b){
        if(b==1 || a==1){
            return a;
        }else if(b==0||a==0){
            return 0;
            
        }
        else{
            return a + kali(a, b-1);
        }
    } 
    


}
