package tugas;
import java.util.Scanner;
class Permutasii {
    protected String[] result;
    protected boolean[] mark;
    protected String [] huruf;
    protected String arr[];
    protected int index = 0;

    public Permutasii(int n,String kata[]){
        this.result = new String[n];
        this.mark = new boolean[n];
        this.huruf = kata;
        int jumlah = 1;
        for(int i = 1; i <=n; i++){
            jumlah *= i;
        }
        this.arr = new String[jumlah];
        
    }
   
    protected void generatePermutasiRek(int curIdx){
        if(curIdx == -1){
            process();
            index++;
        }else{
            for(int i = 0; i < result.length; i++){
                if(this.mark[i] == true){
                    this.mark[i] = false;
                    result[curIdx] = huruf[i];
                    generatePermutasiRek(curIdx-1);
                    this.mark[i] = true;
                }
            }
        }
    }
    protected void process(){
       
            for(int j = 0; j < result.length; j++){
                if(j==0){
                    arr[index] = (this.result[j]);

                }else{
                    arr[index] +=  (this.result[j]);
                }
               
            } 
    }
    public void tampil(){
        for(int i = 0; i<arr.length-1; i++) {
            for (int j = i+1; j<arr.length; j++) {
               if(arr[i].compareTo(arr[j])>0) {
                  String temp = arr[i];
                  arr[i] = arr[j];
                  arr[j] = temp;
               }
            }
         }
        for(int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }
    }
    public void generatePermutasi(){
        
        for(int i = 0; i < this.mark.length; i++){
            this.mark[i] = true;
        }
        generatePermutasiRek(this.result.length-1);
        tampil();
    }
    
}

public class password {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String kata = sc.next();
        int n = kata.length();
        String huruf[] = new String[n];
        for(int i = 0; i < n; i++){
            huruf[i] = String.valueOf(kata.charAt(i));
        }
        Permutasii p = new Permutasii(n,huruf);
        p.generatePermutasi();
    }
    
}
