package modul;

import java.util.Scanner;
class queue{
    protected Object[]arrObject;
    protected int tail;

public queue(int size){
    this.tail = 0;
    arrObject = new Object[size];
}
public boolean isEmpty(){
    if(size() == 0){
        return true;
    }else{
        return false;
    }
}
public boolean offer(Object newObj){
    if(this.tail<arrObject.length){
        this.arrObject[this.tail]=newObj;
        this.tail=this.tail+1;
        return true;
    }
    else{
        return false;
    }
    
        
    

}

public Object poll(){
    if(!this.isEmpty()){
        Object result = arrObject[0];
        for(int i = 1;i<tail;i++){
            arrObject[i-1] = arrObject[i];
        }
        arrObject[tail-1]=null;
        tail = tail - 1;
        return result;
    }
    else{
        return null;
    }
}

public Object peek(){
    if(!this.isEmpty()){
        return arrObject[0];
    }else{
        return null;
    }
}

public int size(){
    return tail;
}

}


public class QueueArrayTester{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        queue array = new queue(10);
        array.offer(1);
        array.offer(2);
        array.offer(3);
 
        System.out.println(array.poll());
        System.out.println(array.poll());
        System.out.println(array.poll());
        System.out.println(array.poll());


    }
}