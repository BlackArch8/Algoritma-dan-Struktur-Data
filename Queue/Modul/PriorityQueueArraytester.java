package modul;
class PriorityQueueArray <E> {
    protected Object[] arrObject;
    protected int head;

    public PriorityQueueArray(int size) {
        this.arrObject = new Object[size];
        this.head = -1;
    }

    public boolean isEmpty() {
        return (this.head == -1);
    }

    public boolean offer(Object newObj) {
        if (head == arrObject.length - 1) {
            return false;
        } else {
            Comparable asComp = (Comparable) newObj;
            int i = head;
            while ((i >= 0) && (asComp.compareTo(arrObject[i]) > 0)) {
                arrObject[i + 1] = arrObject[i];
                i--;
            }
            arrObject[i + 1] = newObj;
            this.head = this.head + 1;
            return true;

        }

    }

    public Object poll() {
        if (head == -1) {
            return null;

        } else {
            Object result = arrObject[this.head];
            arrObject[this.head] = null;
            this.head = this.head-1;
            return result;
        }
    }

    public Object peek() {
        if (this.head == -1) {
            return null;
        } else {
            return arrObject[this.head];
        }
    }

    public int size() {
        return head + 1;
    }
}

public class PriorityQueueArraytester {
    public static void main(String[] args) {
        PriorityQueueArray <Integer> pq = new PriorityQueueArray<Integer>(10);
        pq.offer(1);
        pq.offer(5);
        pq.offer(3);
        pq.offer(5);
        pq.offer(7);
        for(int i = 0; i < pq.size(); i++){
            System.out.println(pq.poll());

        }
        

        
       
        
    }
}
