public class MahasiswaBeraksi {
    public static void main(String[] args) {
        // Membuat object ke-1
        Mahasiswa mahasiswa1 = new Mahasiswa();
        mahasiswa1.nama = "Ahmad";
        mahasiswa1.nim = "123456";
        mahasiswa1.tampilkanNama();
        mahasiswa1.tampilkanNim();
        mahasiswa1.olahraga();

        // Membuat object ke-2
        Mahasiswa mahasiswa2 = new Mahasiswa();
        mahasiswa2.nama = "Budi";
        mahasiswa2.nim = "654321";
        mahasiswa2.tampilkanNama();
        mahasiswa2.tampilkanNim();
        mahasiswa2.olahraga();

        // Membuat object ke-3
        Mahasiswa mahasiswa3 = new Mahasiswa();
        mahasiswa3.nama = "Citra";
        mahasiswa3.nim = "112233";
        mahasiswa3.tampilkanNama();
        mahasiswa3.tampilkanNim();
        mahasiswa3.olahraga();
    }
}