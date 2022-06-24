
import java.util.Scanner;

public class ith {
    public int idx = 1;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        cariith ith = new cariith(arr);
        int hasil = ith.ith();
        if (hasil == 0) {
            System.out.println("tidak ada");
        } else {
            System.out.println("ada");
        }

    }

}

class cariith {
    int[] array;

    public cariith(int[] array) {
        this.array = array;
    }

    private int cekith(int awal, int akhir) {
        if (awal == akhir) {
            if (this.array[awal] == awal + 1) {
                return this.array[awal];

            } else {
                return 0;
            }

        }
        int tengah = (awal + akhir) / 2;

        int kiri = cekith(awal, tengah);

        int kanan = cekith(tengah + 1, akhir);
        return (kiri<tengah)? kanan:kiri;
        
    }

    public int ith() {
        return cekith(0, this.array.length - 1);
    }

}
