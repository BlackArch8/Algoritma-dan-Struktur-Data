package Modul;

public class TesterAddAfter {
    public static void main(String[] args) {
        MyLinkedList myLL = new MyLinkedList();
        myLL.addLast(5);
        myLL.addLast(2);
        myLL.addLast(3);

        myLL.printAllInfo();
        System.out.println();
        myLL.addAfter(myLL.getNode(0), new Integer(1));
        myLL.printAllInfo();
        System.out.println();
        myLL.addAfter(myLL.getNode(1), new Integer(10));
        myLL.printAllInfo();
        System.out.println();
    }

}
