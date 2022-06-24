

import java.util.Scanner;
public class MergeSort{
    
    private void mergeSort (int[] inputArray,int left,int right){
        if(left<right){
            int q = (int)Math.floor((left +right)/2);
            mergeSort(inputArray,left,q);
            mergeSort(inputArray, q+1,right);
            merge(inputArray,left,q,right);
        }

    }
    private void merge(int [] arrayInput,int left,int middle,int right)
{

    int lSize = middle - left + 1;
    int rSize = right- middle;
    int tempArrayL[] = new int[lSize];
    int tempArrayR[] = new int[rSize];

    
    for (int i = 0; i < tempArrayL.length; i++)
        tempArrayL[i] = arrayInput[left + i];
    for (int i = 0; i < tempArrayR.length; i++)
        tempArrayR[i] = arrayInput[middle + i + 1];
 
    int arrayLIdx = 0;
    int arrayRIdx = 0;

    
    for (int i = left; i <= right; i++) {
        
        if (arrayLIdx < tempArrayL.length && arrayRIdx < tempArrayR.length) {
            if (tempArrayL[arrayLIdx] < tempArrayR[arrayRIdx]) {
                arrayInput[i] = tempArrayL[arrayLIdx];
               arrayLIdx++;
            } else {
                arrayInput[i] = tempArrayR[arrayRIdx];
                arrayRIdx++;
            }
        } else if (arrayLIdx < tempArrayL.length) {
            
            arrayInput[i] = tempArrayL[arrayLIdx];
            arrayLIdx++;
        } else if (arrayRIdx < tempArrayR.length) {
            
            arrayInput[i] = tempArrayR[arrayRIdx];
            arrayRIdx++;
        }
    }
    }

    public void sort(int [] arrayInput){
        mergeSort(arrayInput,0,arrayInput.length-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] input;
        int jumlahElemen = sc.nextInt();
        input = new int [jumlahElemen];
        for(int i = 0;i<jumlahElemen;i++){
            input[i] = sc.nextInt();
        }
        MergeSort sorter = new MergeSort();
        sorter.sort(input);
        for(int i = 0;i<jumlahElemen;i++){
            System.out.println(input[i]);
        }
        
    }
}