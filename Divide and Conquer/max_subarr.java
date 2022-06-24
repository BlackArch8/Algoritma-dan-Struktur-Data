import java.util.Scanner;
 
public class max_subarr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr = new int[n];
        
 
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(Max_Subarr(arr,0,arr.length-1));
 
    }
 
    public static int Max_Subarr(int arr[],int awal, int akhir){
        if(akhir==awal){
            return arr[0];
        }
        int tengah = (awal+akhir)/2;
        int maxkiri = Max_Subarr(arr,awal,tengah);
        int maxkanan = Max_Subarr(arr,tengah+1,akhir);
 
        int jumlahkiri = jumlahkiri(arr,tengah,awal);
        int jumlahkanan = jumlahkanan(arr,tengah,akhir);
        int maxtengah = Math.max((jumlahkiri+jumlahkanan),Math.max(jumlahkiri, jumlahkanan));
        return Math.max(Math.max(maxkiri,maxkanan),maxtengah);
 
    }
    public static int jumlahkanan(int arr[],int t,int n){
        int sum = 0,kanan = -1001;
       
        for(int i=t+1;i<=n;i++){
            sum += arr[i];
            kanan = Math.max(kanan, sum);
        }
        return kanan;
    }
    public static int jumlahkiri(int arr[],int t,int awal){
        int sum = 0,kiri = -1001;
       
        for(int i=t;i>=awal;i--){
            sum += arr[i];
            kiri = Math.max(kiri, sum);
        }
        return kiri;
    }
 
 
 
}