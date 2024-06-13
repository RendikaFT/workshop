package collection;
import java.util.LinkedList;

public class TestFIFO {
    public static void main(String[] args) {
        LinkedList<Integer> fifo = new LinkedList<>();
        System.out.println("-------------------------------------------------");
        // Untuk menambahkan elemen Queue/Antrian/Enqueue:
        fifo.offer(1);
        fifo.offer(2);
        fifo.offer(3);
        fifo.offer(4);
        System.out.println(fifo);
        
        System.out.println("-------------------------------------------------");
        // Menghapus nilai antrian/dequeue:
        int removeElement = fifo.poll();
        System.out.println("Element Yang Dihapus" + removeElement);
        System.out.println(fifo);
        
        System.out.println("-------------------------------------------------");
        // Melihat element terdepan tanpa menghapus:
        int headElement = fifo.peek();
        System.out.println("Element Pertama" + headElement);
        System.out.println(fifo);
    }    
}
