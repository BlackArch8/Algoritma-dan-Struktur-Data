package Modul;
import java.util.Scanner;
import java.util.Queue;
import java.util.PriorityQueue;
import java.util.LinkedList;

public class pengukur_baju {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        Queue <Double> queue1 = new LinkedList<Double>();
        Queue <Double> queue2 = new LinkedList<Double>();
        Queue <Double> queue4 = new LinkedList<Double>();

            
        
        PriorityQueue<Double> queue3= new PriorityQueue<Double>();
        Double n = sc.nextDouble();
        Double tinggi = sc.nextDouble();
        Double berat = sc.nextDouble();

        while(tinggi != -1 && berat != -1) {
            queue1.add(tinggi);
            queue2.add(berat);
            queue3.add(berat);

            tinggi = sc.nextDouble();
            berat = sc.nextDouble();
    

        }
        while(!queue3.isEmpty()) {
            if(queue3.peek() ==queue2.peek()){
                queue4.add(queue1.poll());
                queue3.poll();
                queue2.poll();


            }else{
                queue1.add(queue1.poll());
                queue2.add(queue2.poll());
            }

        }
        double total= 0;
        
        for(int i=0; i<n;i++){
            if(queue4.isEmpty()){
                n = 1.0;
                
                break;
            }
            total += queue4.poll();
        }
        double rata = total/n;
        System.out.printf("%.2f",rata);
        
    }
    
}
  
