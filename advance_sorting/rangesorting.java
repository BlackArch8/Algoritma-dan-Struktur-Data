


import java.util.Scanner;

public class rangesorting {
    public static void mergeSort (int[] inputArray,int left,int right){
        if(left<right){
            int q = (int)Math.floor((left +right)/2);
            mergeSort(inputArray,left,q);
            mergeSort(inputArray, q+1,right);
            merge(inputArray,left,q,right);
        }
        


    }
    public static void merge(int [] arrayInput,int left,int middle,int right)
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
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int n = sc.nextInt();
       int []array = new int [n];

       for(int i = 0;i<array.length;i++){
           array[i] = sc.nextInt();


       }
       int a =sc.nextInt()-1;
       int b = sc.nextInt()-1;
       int c = sc.nextInt()-1;

       
       mergeSort(array,a,b);
       
        System.out.println(array[c]);
       
      
    }
    
    
}
