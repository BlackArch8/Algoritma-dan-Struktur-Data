import java.util.Scanner;
 
public class max_subarr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr = new int[n];
        
 
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(Max_Subarr(arr,arr.length));
 
    }
 
    public static int Max_Subarr(int arr[], int n){
        if(n==1){
            return arr[0];
        }
        int tengah = n/2;
        int maxkiri = Max_Subarr(arr,tengah);
        int maxkanan = Max_Subarr(arr,n-tengah);
 
        int jumlahkiri = jumlahkiri(arr,tengah);
        int jumlahkanan = jumlahkanan(arr,tengah,n);
        int maxtengah = Math.max((jumlahkiri+jumlahkanan),Math.max(jumlahkiri, jumlahkanan));
        return Math.max(Math.max(maxkiri,maxkanan),maxtengah);
 
    }
    public static int jumlahkanan(int arr[],int tengah,int n){
        int sum = 0;
        int kanan = Integer.MIN_VALUE;
        for(int i=tengah;i<n;i++){
            sum += arr[i];
            kanan = Math.max(kanan, sum);
        }
        return kanan;
    }
    public static int jumlahkiri(int arr[],int tengah){
        int sum = 0;
        int kiri = Integer.MIN_VALUE;
        for(int i=tengah-1;i>=0;i--){
            sum += arr[i];
            kiri = Math.max(kiri, sum);
        }
        return kiri;
    }
 
 
 
}