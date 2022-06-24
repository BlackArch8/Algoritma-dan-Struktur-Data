
import java.util.Scanner;
import java.util.Queue;
import java.util.LinkedList;

public class team_queue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int scenario = 0;

        while(n!=0){
            
            Queue<Integer> queue = new LinkedList<Integer>();
            Queue<Integer> queue1 = new LinkedList<Integer>();
            int k[] = new int[n];
            int k2[] = new int[n];
            int temp = 0;
            for(int i=0; i<n; i++){
                k[i] = sc.nextInt();
                for(int j=0; j<k[i]; j++){
                    queue.add(sc.nextInt());
                    
                    
                }
                
            }
            for(int i=0; i<n; i++){
                k2[i] += k[i];
            }
            String operasi = sc.next();
            int ktemp = 0;
            while(!operasi.equals("STOP")){
                if(operasi.equals("ENQUEUE")){
                    int orang = sc.nextInt();
                    int count = 1;
                    for(int i = 0; i<n; i++){
                        if(orang==(queue.peek())){
                            break;
                        }else{
                            count++;//index orang
                            //1
                        }
    
                    }
                    int kelompok = 0;
                    while(kelompok<n){
                        if(count < k[kelompok]){

                            //kelompok array
                            break;
    
                            
                        }else{
                            kelompok++;
                        }
                        
                    }
                    //kelompok
                    
                    
                    if(queue1.isEmpty()){ 
                        
                        
                        queue1.add(queue.poll());
                        k[ktemp] --;
                        temp = kelompok;
                        
    
                    }else{

                        if(kelompok == temp){
                            queue1.add(queue.poll());
                            k[ktemp] --;
                        }
                       
                    }
                    
                }else{
                    System.out.println(queue1.poll());
                }
                operasi = sc.next();

            }
            


            System.out.println("Scenario #" + scenario);
            scenario++;

            n = sc.nextInt();
        }
    }
}
