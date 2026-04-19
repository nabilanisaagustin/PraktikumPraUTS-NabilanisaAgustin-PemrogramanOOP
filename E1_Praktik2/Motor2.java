public class Motor2 {
    // Atribut
    private String warna;
    private String merk;

    // Constructor
    public Motor2(String warna, String merk) {
        this.warna = warna;
        this.merk = merk;
    }

    // Metode Setter untuk mengubah warna
    public void setWarna(String warna) {
        this.warna = warna;
    }

    // Metode Setter untuk mengubah merk
    public void setMerk(String merk) {
        this.merk = merk;
    }

    // Metode untuk menampilkan informasi
    public void tampilkanInfo() {
        System.out.println("Warna: " + warna);
        System.out.println("Merk: " + merk);
    }
}
