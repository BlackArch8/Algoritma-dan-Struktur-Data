package Modul;

public class TesterRemoveLast {
    public static void main(String[] args) {
        MyLinkedList myLL = new MyLinkedList();
        myLL.addLast(5);
        myLL.addLast(2);
        myLL.addLast(3);
        

        System.out.println("sebelum diremoveLast");
        myLL.printAllInfo();
        System.out.println();

        Object objRemovedNodeInfo=myLL.removeLast();
        System.out.println("setelah diremoveLast");
        myLL.printAllInfo();
        System.out.println();
        // contoh cara casting kelas Object ke salah satu subclassnya
        //(dalam kasus ini dicast ke kelas Integer)
        Integer intRemovedInfo=(Integer)objRemovedNodeInfo;
        System.out.println("nilai info yang diremove="+intRemovedInfo.intValue());
        int hasilPlus10=intRemovedInfo.intValue()+10;
        System.out.println("nilai info yang diremove ditambah 10="+hasilPlus10);

    }
    
}
