import modul.MyLinkedList;
import modul.MyNode;

class MyNode {
    private Object info;
    private MyNode next;

    public void setNext(MyNode next) {
        this.next = next;
    }
    public MyNode getNext() {
        return next;
    }
    public Object getInfo(){
        return info;
    }
    public void setInfo(Object info) {
        this.info = info;
    }
    public MyNode(Object info) {
        this.info = info;
        this.next = null;
    }
    
}
class MyLinkedList {
    private MyNode head;
    private int count;

    public MyLinkedList() {
        head = null;
        count = 0;
    }
    public boolean isEmpty(){
        return head==null;
    }
    public void push(Object info){
        MyNode newNode = new MyNode(info);
        
        if(!isEmpty()){
            newNode.setNext(head);

        }
        head = newNode;
    }
    public Object peek(){
        MyNode cur = head;
        
       
        if(cur!=null){
            
            return cur.getInfo();
            
            
            
        }
        return null;
    }
    public Object pop(){
        if(head==null){
            return null;
        }else{
            count = count-1;
            MyNode removedNode = head;
            head = head.getNext();
            return removedNode.getInfo();
        }
    }
}



public class Stack_linkedlist {
    public static void main(String[] args) {
        MyLinkedList stk = new MyLinkedList();
        Object tesPeek = stk.peek();
        System.out.println(tesPeek);
        Object tesPop = stk.pop();
        System.out.println(tesPop);
        
        
        boolean kosong=stk.isEmpty();
        System.out.println(kosong);
        stk.push(10);
        stk.push(12);
        stk.push(13);
        stk.push(14);
        tesPop= stk.pop();
        System.out.println(tesPop);
        tesPop= stk.pop();
        System.out.println(tesPop);
        tesPeek =stk.peek();
        
        
        System.out.println(tesPeek);
        stk.push(18);
        stk.push(19);
        stk.push(20);
        stk.push(21);
        tesPeek= stk.peek();
        System.out.println(tesPeek);



        
    }
    
}
