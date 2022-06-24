package Modul;
import java.util.Scanner;
import java.util.Queue;
import java.util.LinkedList;
public class josephus_problem {
    public static void main(String[] args) {
        Queue <String> queue = new  LinkedList<String>();
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        int tentara = sc.nextInt();
        for(int i = 0; i<n; i++){
            queue.add(sc.next());
        }
        int count = 1;
        while(queue.size() > 1){

            if(count%tentara==0){
                queue.poll();
            }else{
                queue.add(queue.poll());
            }
            count++;
        }
        System.out.println(queue.peek());


    }
}
