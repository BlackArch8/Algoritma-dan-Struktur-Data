import java.util.Arrays;
import java.util.Scanner;
public class Mahasiswa implements Comparable<Mahasiswa>{
    private String nama;
    private double indeksPrestasi;
    private int sksLulus;

    public Mahasiswa(String nama, double indeksPrestasi,int sksLulus){
        this.nama = nama;
        this.indeksPrestasi = indeksPrestasi;
        this.sksLulus = sksLulus;
    }
    @Override
    public int compareTo(Mahasiswa mhs){
        if(this.indeksPrestasi>mhs.indeksPrestasi){
            return 1;
        }
        else if(this.indeksPrestasi==mhs.indeksPrestasi){
            if(this.sksLulus>mhs.sksLulus){
                return 1;
            }
            else if(this.sksLulus == mhs.sksLulus){
                return 0;

            }
            else{
                return -1;
            }
        }
        else{
            return -1;
        }
    }
    public String getnama(){
        return nama;
    }
    public double indeksPrestasi(){
        return indeksPrestasi;
    }
    public int skslulus(){
        return sksLulus;
    }
    public String toString(){
        String mhs = this.nama + " " + this.indeksPrestasi+" " +this.sksLulus;
        return mhs;
    }
    


}
class tester{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String  [] nama = new String[n];
        int  [] indeksprestasi = new int[n];
        int [] sks = new int[n];
        for(int i = 0;i<n;i++){
             nama[i] = sc.next();
             indeksprestasi[i] =sc.nextInt();
             sks[i] = sc.nextInt(); 

            
            
        }
        Mahasiswa[] bnykmahasiswa = new Mahasiswa{(nama,indeksprestasi,sks)};
        Arrays.sort(bnykmahasiswa);
        for(Mahasiswa index:bnykmahasiswa){
            System.out.println(index);
        }
    }
}









