package collection;
import java.util.HashMap;

/* MAP
    Sepasang key - value*/

public class TesMap {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();
        map.put(1, "Berliana");
        map.put(2, "Elok");
        map.put(3, "Faiqoh");
        map.put(4, "Sawako");
        
        System.out.println(map.keySet());       // Mencetak key saja
        System.out.println(map.values());       // Mencetak value saja
        System.out.println(map.entrySet());     // Mencetak key dan value
        
        map.put(2, "ell");                      // Mengganti value
        System.out.println(map.entrySet());
        
        map.remove(3);                          // Menghapus value
        System.out.println(map.entrySet());
        
        System.out.println(map.get(4));
    }
}
