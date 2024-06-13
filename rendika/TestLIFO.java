package collection;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Stack;

public class TestLIFO {
    public static void main(String[] args) {
        Stack<String> lifo = new Stack<>();
        
        System.out.println("-------------------------------------------------");
        // Menambah element ke stack
        lifo.push("Rendika");
        lifo.push("Firzy");
        lifo.push("Taruna");
        lifo.push("Jiroo");
        System.out.println(lifo);
        
        System.out.println("-------------------------------------------------");
        // Menghapus element dari stack
        String removeElement = lifo.pop();
        System.out.println("Element Yang Dihapus: " + removeElement);
        System.out.println(lifo);
        
        System.out.println("-------------------------------------------------");
        // Melihat element teratas tanpa menghapus
        String headElement = lifo.peek();
        System.out.println("Element Teratas: " + headElement);
        System.out.println(lifo);
        
        System.out.println("-------------------------------------------------");
        lifo.pop();
        System.out.println(lifo);
        lifo.pop();
        System.out.println(lifo);
        lifo.pop();
        System.out.println(lifo);
        
        /*System.out.println("-------------------------------------------------");
        if(!lifo.isEmpty())
            lifo.pop();*/
        
        System.out.println("-------------------------------------------------");
        if(!lifo.isEmpty())
        lifo.peek();
        
        System.out.println("-------------------------------------------------");
        // LIFO Menggunakan Deque
        Deque<String> lifo2 = new ArrayDeque<>();
        lifo2.push("Rendika");
        lifo2.push("Firzy");
        lifo2.push("Taruna");
        lifo2.push("Jiroo");
        System.out.println(lifo2);
    }
}
