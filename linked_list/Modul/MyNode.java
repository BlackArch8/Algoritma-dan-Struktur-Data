package Modul;

public class MyNode {
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
