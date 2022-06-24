import java.util.Scanner;


class MaxInArray{
    int [] array;

    public MaxInArray(int[] array){
        this.array = array;
    }

    private int MaxInArrayRec(int awal,int akhir){
        if(awal==akhir){
            return array[awal];
        }else{
            int tengah = (awal+akhir)/2;
            int maxKiri = MaxInArrayRec(awal,tengah);
            int maxKanan = MaxInArrayRec(tengah+1,akhir);
            if(maxKiri>maxKanan){
                return maxKiri;

            }else{
                return maxKanan;
            }
        }
    }
    public int maxInArray(){
        return MaxInArrayRec(0,this.array.length-1);
    }

}

public class Max_in_array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] array = new int[n];
        for(int i=0; i<n; i++){
            array[i] = sc.nextInt();

        }
        MaxInArray max = new MaxInArray(array);
        System.out.println("Max in Array=" + max.maxInArray());
        
    }

    
}
