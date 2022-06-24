package Modul;

public class TesterAddFirst {
    public static void main(String[] args) {
        MyLinkedList myLL = new MyLinkedList();
        myLL.addFirst(5);
        myLL.addFirst(2);
        myLL.addFirst(3);
        myLL.printAllInfo();
    }
    
}
