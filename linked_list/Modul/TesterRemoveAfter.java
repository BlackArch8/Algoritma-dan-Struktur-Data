package Modul;

public class TesterRemoveAfter {
    public static void main(String[] args) {
        MyLinkedList myLL = new MyLinkedList();
        myLL.addLast(5);
        myLL.addLast(4);
        myLL.addLast(3);
        myLL.addLast(2);
        myLL.addLast(1);
        

        System.out.println("sebelum diremoveAfter");
        myLL.printAllInfo();
        System.out.println();

        myLL.removeAfter(myLL.getNode(0));
        System.out.println("setelah diremoveAfter");
        myLL.printAllInfo();
        System.out.println();
    }
    
}
