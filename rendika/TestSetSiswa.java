package collection;
import java.util.HashSet;

public class TestSetSiswa {
    public static void main(String[] args) {
        Siswa s1 = new Siswa(234, "Rendika");
        Siswa s2 = new Siswa(224, "Jirooo");
        
        HashSet<Siswa> daftarSiswa = new HashSet<>();
        daftarSiswa.add(s1);
        daftarSiswa.add(s2);
        System.out.println(daftarSiswa);
    }
}
