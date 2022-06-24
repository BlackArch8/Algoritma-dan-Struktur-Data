

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

    
}class MyLinkedList {
    private MyNode head;
    private int count;
    private MyNode tail;

    public MyLinkedList() {
        head = null;
        count = 0;
    }

    public void addLast(Object info) {

        // buat sebuah node baru dan set infonya ke parameter info yang diberikan
        MyNode newNode = new MyNode(info);
        // bila list masih kosong maka newNode akan menjadi head yang baru
        if (head == null) {
            head = newNode;
            tail = newNode;
        }
        // bila tidak kosong maka kita perlu mencari node terakhir dari list
        else {
            this.tail.setNext(newNode);
            this.tail = newNode;
        }
        count = count + 1;
    }
    public boolean isEmpty(){
        return head==null;
    }

    public void addFirst(Object info){
        MyNode newNode = new MyNode(info);
        
        if(!isEmpty()){
            newNode.setNext(head);

        }
        head = newNode;
    }

    public Object removeFirst(){
        if(head==null){
            return null;
        }else{
            count = count-1;
            MyNode removedNode = head;
            head = head.getNext();
            if(head==null){
                tail = null;
            }
            return removedNode.getInfo();
        }
    }

    public Object removeLast(){
        if(isEmpty()){
            return null;
        }else{
            if(head.getNext() == null){
                MyNode p = head;
                head = null;
                return p;

            }else{
                MyNode p = head;
                MyNode q = p.getNext();
                while(q.getNext() != null){
                    p = p.getNext();
                    q = q.getNext();

                }
                p.setNext(null);
                MyNode removedNode = q;
                return removedNode.getInfo();

            }
        }
    }

    public MyNode getNode(int index){
        MyNode cur = head;
        int count =0;
       
        while(cur!=null){
            if(count==index){
                return cur;
            }
            count++;
            cur = cur.getNext();
        }
        return null;
    }
    public int size(){
        MyNode cur = head;
        int count = 0;
        while (cur!=null){
            count++;
            cur = cur.getNext();

        }
        return count;
        
    }

    public void addAfter(MyNode prevnode,int info){
        MyNode newNode = new MyNode(info);
        //arahkan next dari newNode ke next dai prevnode
        newNode.setNext(prevnode.getNext());
        //ganti next dari prevNode sehingga dia mengarah ke newnode
        prevnode.setNext(newNode);
        //hasil akhirnya adalah newNode disisipkan di antara prevNode dan prev
        //node yang sebelumnya menjadi next dari prevNode 
        count++;

    }
    public void removeAfter(MyNode prevnode){
        MyNode p = prevnode.getNext();
        prevnode.setNext(p.getNext());
        p.setNext(null);
    }
    
    public void printAllInfo() {

        // variabel cur pada awalnya diisi dengan head
        MyNode cur = head;
        
        while (cur != null) {
            System.out.print(cur.getInfo().toString() + " ");
            // set variabel cur ke node berikutnya
            cur = cur.getNext();
        }
    }

}
class QueueLL<E> {
    protected MyLinkedList linkedList;
    public QueueLL(){
       linkedList = new MyLinkedList();

    }
    public boolean isEmpty(){
        if(linkedList.size() == 0){
            return true;
        }else{
            return false;
        }
    }
    public boolean offer(Object newObj){
        linkedList.addLast(newObj);
        return true;
    }
    public Object poll(){
        if(!linkedList.isEmpty()){
            return linkedList.removeFirst();
        }else{
            return null;
        }
    }
    public Object peek(){
        if(!this.isEmpty()){
            return linkedList.getNode(0);
        }else{
            return null;
        }
    }
    public int size(){ 
        return linkedList.size();
    }
    
}
public class halo{
    public static void main(String[] args) {
        QueueLL <Integer> queue = new QueueLL<Integer>();
        queue.offer(1);
        System.out.println(queue.poll());
    }
}
