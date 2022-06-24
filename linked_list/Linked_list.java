class Node{
    int data;
    Node next;
}

class linkedlist{
    Node head;
    public void insert(int data){
       Node node = new Node();
       node.data = data;
       node.next = null; 

       if(head == null){
           head = node;
       }else{
           Node n = head;
           while(n.next != null){
               n = n.next;

           }
           n.next = node;
       }
    }
    public void show(){
        Node node = head;
        while(node.next!=null){
            System.out.println(node.data);
            node = node.next;
        }
        System.out.println(node.data);

    }
    public boolean cari(int angka){
        boolean hasil = false;
        Node curr = head;
        while (curr!=null){
            if((int)curr.info==angka){
                hasil = true;
                break;
            }
            curr = curr.next;
            

        }
        return hasil;


    }
    public void insertfirst(Node newnode){
        if(!sEmpty()){
            this.head = newNode;

        }else{

        }
    }


    

}




public class Linked_list{
    public static void main(String[] args) {
        linkedlist list = new linkedlist();
        list.insert(10);
        list.insert(12);
        list.insert(20);

        list.show();
        
        
    }
}