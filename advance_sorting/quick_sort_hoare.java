
import java.util.*;
public class quick_sort_hoare {
    public int hoare(int [] inputArray,int left,int right){
        int pivot = inputArray[left];
        int i = left - 1;
        int j = right+1;
        while(true){
            do{
                j--;
            }
            while (inputArray[j]>pivot);
            do{
                i++;
            }
            while(inputArray[i]<pivot);
            if(i<j){
                int temp = inputArray[i];
                inputArray[i] = inputArray[j];
                inputArray[j] = temp;
            }
            else{
                return j;
            }
        }
    }
    private void quickSort(int [] inputArray,int left,int right){
        if(left<right){
            int pivotindex = hoare(inputArray, left, right);
            quickSort(inputArray, left, pivotindex);
            quickSort(inputArray, pivotindex+1, right);
        }
    }
    public void sort (int[] arr){
        quickSort (arr,0,arr.length-1);
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
