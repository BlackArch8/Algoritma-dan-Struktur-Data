package Modul;

public class MyLinkedList {
    private MyNode head;
    private int count;

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
        }
        // bila tidak kosong maka kita perlu mencari node terakhir dari list
        else {
            MyNode cur = head;
            // lakukan loop selama cur bukan node terakhir dari list
            // (atribut next dari node terakhir list akan bernilai null)
            while (cur.getNext() != null) {
                // majukan cur ke node berikutnya
                cur = cur.getNext();
            }
            // jadikan newNode sebagai next dari node terakhir tersebut
            cur.setNext(newNode);
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
    public int getSize(){
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
