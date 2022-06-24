package Modul;
import java.util.Vector;
public class VectorTester {
    public static void main(String[] args) {
        Vector objList = new Vector();
        System.out.println("Size awal="+objList.size());
        objList.add("abc");

        System.out.println("size setelah dimasukkan 1 elemen=" + objList.size());

        objList.add("xyz");
        objList.add("def");
        System.out.println("isi seluruh list");
        for(int i = 0; i < objList.size(); i++){
            System.out.println(objList.get(i));
        }

        //ubah data pada posisi keduanya
        objList.set(1,"gaooo");
        System.out.println("isi seluruh list setelah diubah");
        for(int i = 0; i < objList.size(); i++){
            System.out.println(objList.get(i));
        }
    }

    

    
}
