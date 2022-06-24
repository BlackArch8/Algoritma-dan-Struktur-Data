
import java.util.Scanner;
class MyArray {
    int [] array;
    
    public MyArray(int []array){
        this.array = array;
    }

    private int sumInArrayRec(int []arr){

        if(arr.length==1){
            return arr[0];

        }else{
            int panjangKiri = arr.length/2;
            int panjangKanan = arr.length-panjangKiri;
            
            int arrKiri[] = new int [panjangKiri];
            int arrKanan[] = new int [panjangKanan];


            System.arraycopy(arr,0,arrKiri,0,panjangKiri);

            System.arraycopy(arr,panjangKiri,arrKanan,0,panjangKanan);
            return sumInArrayRec(arrKiri) + sumInArrayRec(arrKanan);
        }
    }

    public int sumInArray(){
        return sumInArrayRec(this.array);
    }
    
}
public class SumArray{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ukuranArray = sc.nextInt();
        int [] array = new int[ukuranArray];
        for(int i=0; i<ukuranArray; i++){
            array[i] = sc.nextInt();
        }
        MyArray myarr = new MyArray(array);
        System.out.println("Sum in Array=" + myarr.sumInArray());
    }
}
