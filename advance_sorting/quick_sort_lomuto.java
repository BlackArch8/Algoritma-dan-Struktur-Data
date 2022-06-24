
import java.util.Scanner;
public class quick_sort_lomuto{
    private void quicksort(int []inputArray,int left,int right){
        if(left<right){
            int pivotIndex = lomuto(inputArray,left,right);
            quicksort(inputArray,left,pivotIndex+1);
            quicksort(inputArray,pivotIndex+1,right);

        }
    }
    private int lomuto(int [] inputArray,int left,int right){
        int pivot = inputArray[right];
        int i = left -1;
        for(int j = left;j<right;j++){
            if(inputArray[j]<=pivot){
                i++;
                int temp = inputArray[i];
                inputArray[i] = inputArray[j];
                inputArray[j] = temp;
            }
        }
        i++;
        int temp = inputArray[i];
        inputArray[i] = inputArray[right];
        inputArray[right] = temp;
        return i;
    }
    public void sort(int [] inputArray){
        quicksort(inputArray, 0, inputArray.length-1);
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] input;
        int jumlahElemen = sc.nextInt();
        input = new int [jumlahElemen];
        for(int i = 0;i<jumlahElemen;i++){
            input[i] = sc.nextInt();
        }
        quick_sort_hoare sorter = new quick_sort_hoare();
        sorter.sort(input);
        for(int i = 0;i<jumlahElemen;i++){
            System.out.println(input[i]);
        }
    }
}