public class Motor2Beraksi {
    public static void main(String[] args) {
        // Membuat objek awal (Hitam, Yamaha)
        Motor2 motor = new Motor2("Hitam", "Yamaha");
        motor.tampilkanInfo();

        // Mengubah data menggunakan metode setter
        motor.setWarna("Biru");
        motor.setMerk("Suzuki");

        // Menampilkan info kembali setelah diubah
        motor.tampilkanInfo();
    }
}