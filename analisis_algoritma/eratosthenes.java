import java.util.Scanner;
public class eratosthenes {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        int array[] = new int[n];
        array = PrimeNaiv(n);
        for(int i =0;i<n;i++){
            if(array[i]!= 0){
            System.out.print(array[i]+" ");


            }
        }
        System.out.println();
        long start;
        long end;
        long waktuproses;
        eratosthenes prime = new eratosthenes();
        start = System.currentTimeMillis();
        
        end = System.currentTimeMillis();
        waktuproses = end - start;
        
        System.out.println(waktuproses);

        
        
        
    }
    public static int[] PrimeNaiv(int n){
        int array[] = new int[n];
        int hasil[] = new int[n];
        for(int i = 2;i<n;i++){
            array[i] = i;
        }
        for(int i = 2;i<Math.sqrt(n);i++){
            if (array[i] != 0){
                int j = i * i;
                while(j<n){
                    array[j] = 0;
                    j = j + i;
                }
                
            }
        }
        int i = 0;
        for(int p = 2;p<n;p++){
            if(array[p] != 0){
                hasil[i] = array[p];
                

            }
            i++;
            
        }
        return hasil;
    }
    
}
