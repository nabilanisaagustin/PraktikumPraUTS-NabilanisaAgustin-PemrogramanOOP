public class Mahasiswa {
    // Atribut
    private String nama;
    private int sks;

    // Constructor
    public Mahasiswa(String nama, int sks) {
        this.nama = nama;
        this.sks = sks;
    }

    // Metode Setter
    public void setSks(int sks) {
        this.sks = sks;
    }

    // Metode Getter
    public int getSks() {
        return sks;
    }

    // Metode untuk menampilkan informasi
    public void tampilkanInfo() {
        System.out.println("Nama: " + nama);
        System.out.println("SKS: " + sks);
    }
}