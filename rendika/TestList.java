package collection;
import java.util.ArrayList;
import java.util.Vector;

/*LIST
    Memiliki Index
    ArrayList
    Boleh Duplikasi*/

public class TestList {
    public static void main(String[] args){
        ArrayList list= new ArrayList();
        list.add("Erlangga");
        list.add("Rendika");
        list.add("Arin");
        
        System.out.println(list);
        for (Object element : list){
            System.out.println(element);
        }
        list.add(1, "Fidelis");
        System.out.println(list);
        
        list.add("Erlangga");
        System.out.println(list);
        
        System.out.println(list.remove("Rendika"));
        System.out.println(list);
        
        System.out.println(list.remove("Sawako"));
        System.out.println(list);
        
        System.out.println(list.isEmpty());
        System.out.println(list.size());
        
        list.clear();
        System.out.println(list.isEmpty());
        System.out.println(list.size());
        
        list.add(new Object());
        
        String [] Nama;
        // Generic = Membatasi tipe elemen yang ada dalam sebuah collection
        ArrayList<String> list2 = new ArrayList<>();
        list2.add("Satu");
        list2.add("Dua");
        System.out.println(list2);
        
        Vector<String> list3 = new Vector<>();
        list3.add("Erlangga");
        list3.add("Rendika");
        list3.add("Arin");
        list3.add("Arin");
        System.out.println(list3);
    }
}
