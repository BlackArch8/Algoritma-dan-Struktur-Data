

import java.util.Scanner;
class karystrings {
    protected int [] result;
    protected int k;
    public karystrings(int length,int k) {
        result = new int[length];
        this.k = k;
    }
    protected void generateKAryStringRek(int curIdx){
        if(curIdx ==-1){
            process();
        }
        else{
            for(int i = 0; i < k; i++){
                result[curIdx] =i;
                generateKAryStringRek(curIdx-1);
            }
        }
    }
    protected void process(){
        for(int i = 0; i < result.length; i++){
            System.out.print(result[i]);
        }
        System.out.println();
    }
    public void generateKAryString(){
        generateKAryStringRek(result.length-1);
    }
    
}
public class KAryString{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        karystrings ary = new karystrings(n,k);
        ary.generateKAryString();
    }
}
