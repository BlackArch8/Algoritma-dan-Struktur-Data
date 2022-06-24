import java.util.Scanner;
class bitstrings{
    protected int[] result;
    public bitstrings(int n) {
         result = new int[n];
    
}

    protected void generateBitString(int curIdx){
        if(curIdx == -1){
            process();
        }else{
            result[curIdx]=0;
            generateBitString(curIdx-1);
            result[curIdx]=1;
            generateBitString(curIdx-1);
        }
    }
    protected void process(){
        for(int i=0; i<result.length;i++){
            System.out.print(result[i]);
        }
        System.out.println();
    }
    public void generateBitString(){
        generateBitString(result.length-1);
    }
}
public class BitString{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        bitstrings bit = new bitstrings(n);
        bit.generateBitString();

    }
}
