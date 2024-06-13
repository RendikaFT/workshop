package collection;
import java.util.ArrayList;
import java.util.HashSet;

/*SET
    Tidak Ada Urutan
    Tidak Ada Duplikasi*/

public class TestSet {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
        set.add("Satu");
        set.add("Dua");
        set.add("Tiga");
        System.out.println(set.add("Satu"));
        System.out.println(set.add("satu"));
        System.out.println(set);
        System.out.println(set.size());
        
        System.out.println("========================================");
        System.out.println("Keluaran List");
        System.out.println("----------------------------------------");
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(10);
        list.add(100);
        list.add(1000);
        list.add(10000);
        list.add(10000);
        list.add(1000);
        list.add(100);
        list.add(10);
        list.add(1);
        System.out.println(list);
        System.out.println("========================================");
        
        System.out.println("Keluaran Set");
        System.out.println("----------------------------------------");
        HashSet set2 = new HashSet(list);
        System.out.println(set2);
        System.out.println("========================================");
        System.out.println(set2);
        set2.remove(100);
        set2.remove(1000);
        set2.remove(10000);
        System.out.println(set2);
    }
}
