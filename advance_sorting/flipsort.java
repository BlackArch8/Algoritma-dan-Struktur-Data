
import java.util.Scanner;
public class flipsort {
           
        public static int mergeSort (int[] inputArray,int left,int right){
            int total = 0;
            if(left<right){
                int q = ((left +right)/2);
                total += mergeSort(inputArray,left,q);
                total += mergeSort(inputArray, q+1,right);
                total += merge(inputArray,left,q,right);
                
            }
            return total;
            
    
    
        }
        private static int  merge(int [] arrayInput,int left,int middle,int right)
{
    int lSize = middle-left+1;
    int rSize = right-middle;
    int [] tempArrayL = new int [lSize+1];
    int [] tempArrayR = new int [rSize+1];
    for(int i = 0;i<lSize;i++){
        tempArrayL[i] = arrayInput[left+i];

    }
    for(int i = 0;i<rSize;i++){
        tempArrayR[i] = arrayInput[middle+1+i];
    }
    tempArrayL[lSize] = Integer.MAX_VALUE;
    tempArrayR[rSize] = Integer.MAX_VALUE;
    int arrayLIdx = 0;
    int arrayRIdx = 0;
    int sum = 0;
    for(int i = left;i<=right;i++){
        if(tempArrayL[arrayLIdx]<=tempArrayR[arrayRIdx]){
            arrayInput[i] = tempArrayL[arrayLIdx];
            arrayLIdx+=1;
           
        }
        else{
            arrayInput[i] = tempArrayR[arrayRIdx];
            arrayRIdx+=1;
            sum += (middle+ 1) - (left+arrayLIdx);
           
        }
    }
    return sum;
}
    public static void main(String[] args) {
     
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    for(int i = 0;i<n;i++){
        int panjang = sc.nextInt();
        int []array = new int [panjang];
        
    for(int j = 0;j<panjang;j++){
            array[j] = sc.nextInt();
    }
    System.out.println("Minimum exchange operations : "+mergeSort(array, 0, array.length - 1));




    }
    
   
 }
}
