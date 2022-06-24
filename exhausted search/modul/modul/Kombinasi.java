
import java.util.Scanner;

class Kombinasii {
    protected int[] result;
    protected int n;

    public Kombinasii(int n, int length) {
        this.result = new int[length];
        this.n = n;
    }

    protected void generateKombinasiRek(int iStartValue, int curIdx) {
        if (curIdx == this.result.length) {
            process();
        } else {
            for (int i = iStartValue; i <= n - this.result.length + curIdx + 1; i++) {
                this.result[curIdx] = i;
                generateKombinasiRek(i + 1, curIdx + 1);
            }
        }
    }

    protected void process() {
        for (int i = 0; i < this.result.length; i++) {
            System.out.print(this.result[i]);

        }
        System.out.println();
    }
    public void generateKombinasi(){
        generateKombinasiRek(1, 0);
    }
}
public class Kombinasi{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int length = sc.nextInt();
        Kombinasii k = new Kombinasii(n, length);
        k.generateKombinasi();


    }
}
