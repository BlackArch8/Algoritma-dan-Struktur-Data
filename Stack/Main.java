import java.util.Scanner;
class Arraystack {
    /**
     * Artibut ini digunakan untuk menyimpan data ke dalam stack
     */

    private Object[] elements;

    /**
     * Atribut ini digunakan sebagai indeks dari atribut elements
     * yang dapat dimasuki oleh elemen baru ketika operasi push dilakukan.
     * Element ini juga dapat menjadi size dari stack
     **/
    private int top;

    /**
     * Constructor
     * 
     * @param maxCapacity:maksimum banyaknya elemen yang bisa disimpan oleh stack
     **/
    public Arraystack(int maxCapacity) {
        this.elements = new Object[maxCapacity];
        this.top = 0;
    }

    /**
     * Method untuk memasukkan elemen baru ke stack
     * 
     * @param newElement:elemen baru yang akan ditambahkan ke stack
     * @return true apabila berhasil memasukkan elemen baru,false jika sebaliknya
     **/

    public boolean push(Object newElement) {
        if (this.top < elements.length) {
            this.elements[top] = newElement;
            top++;
            return true;
        } else
            return false;
    }

    /**
     * Method untuk mengeluarkan elemen teratas dari stack
     * 
     * @param
     * @return elemen teratas dari stack.Method mengembalikan null bila stack kosong
     **/

    public Object pop() {
        Object poppedElement = null;
        if (this.top > 0) {
            poppedElement = this.elements[top - 1];
            top--;
        }
        return poppedElement;
    }

    /**
     * Method untuk mendapatkan elemen teratas dari stack tanpa mengeluarkannnya.
     * @param
     * @return elemen teratas dari stack.Method mengembalikan null bila stack
     *         kosong.
     **/
    public Object peek() {

        Object poppedElement = null;
        if (this.top > 0) {
            poppedElement = this.elements[top - 1];
        }
        return poppedElement;
    }
    /**
     * Method untuk memriksa apakah stack kosong
     * @param
     * @return true jika stack kosong,false jika tidak.
     **/

     public boolean isEmpty() {
         return this.top == 0;
     }

}

public class Main{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int maxCapacity=5;
        Arraystack as=new Arraystack(maxCapacity);
        Object tesPeek=as.peek();
        System.out.println(tesPeek);
        Object tesPop=as.pop();
        System.out.println(tesPop);
        boolean kosong=as.isEmpty();
        System.out.println(kosong);
        as.push(10);
        as.push(12);
        as.push(13);
        as.push(14);
        tesPop= as.pop();
        System.out.println(tesPop);
        tesPop= as.pop();
        System.out.println(tesPop);
        tesPeek =as.peek();
        System.out.println(tesPeek);
        as.push(18);
        as.push(19);
        as.push(20);
        as.push(21);
        tesPeek= as.peek();
        System.out.println(tesPeek);
    }

}