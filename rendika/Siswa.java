package collection;

public class Siswa {
    
        int nim;
        String nama;

    public Siswa(int nim, String nama) {
        this.nim = nim;
        this.nama = nama;
    }

    public int getNim() {
        return nim;
    }

    public void setNim(int nim) {
        this.nim = nim;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    @Override
    public String toString() {
        return "siswa{" + "nim=" + nim + ", nama=" + nama + '}';
    }
        
        
    }

