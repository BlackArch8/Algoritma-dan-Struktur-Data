import java.util.Scanner;
public class count_sort {
    public static int [] internalsort(int [] arrayA,int [] arrayB,int k){
        int [] arrayC = new int [k+1];
        int i,j;
        int n = arrayA.length;
        for( j = 0;j<n;j++){
            arrayC[arrayA[j]] +=1;

        }
        for( i = 1;i<=k;i++){
            arrayC[i] = arrayC[i]+arrayC[i-1];
            
        }
        for(j = n-1;j>=0;j--){
            arrayB[arrayC[arrayA[j]-1]] = arrayA[j];
            arrayC[arrayA[j]]--;
        }
        return arrayB;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] input;
        int k = sc.nextInt();
        int jumlahElemen = sc.nextInt();
        input = new int [jumlahElemen];
        for(int i = 0;i<jumlahElemen;i++){
            input[i] = sc.nextInt();
        }
        int b[]=new int [jumlahElemen];
        int res[] = internalsort(input,b,k);
        for(int i = 0;i<jumlahElemen;i++){
            b[i] = res[i];
            System.out.println(res[i]);
        }
    }
    
}
