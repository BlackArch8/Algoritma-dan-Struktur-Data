package Modul;

import java.util.LinkedList;

public class LinkedListTester {
    public static void main(String[] args) {
        LinkedList objList = new LinkedList();
        System.out.println("size awal=" + objList.size());
        objList.add("abc");
        System.out.println("size setelah dimasukkan1elemen=" + objList.size());
        objList.add("xyz");
        objList.add("def");
        System.out.println("isi seluruh list");
        for (int i = 0; i < objList.size(); i++) {
            System.out.println(objList.get(i));
        }
        // ubah data pada posisi kedua
        objList.set(1, "gaooo");
        System.out.println("isi seluruh list setelah diubah");
        for (int i = 0; i < objList.size() ; i++) {
            System.out.println(objList.get(i));
        }
        System.out.println("\npengujian method-method tambahan milik linked list");
        objList.addLast("last");
        objList.addFirst("first");
        System.out.println(objList.removeFirst().toString());
        System.out.println(objList.peek().toString());
        System.out.println(objList.peek().toString());
    }
}
