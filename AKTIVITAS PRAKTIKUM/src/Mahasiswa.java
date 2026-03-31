public class Mahasiswa {
    String nama;
    int umur;
    String jurusan;

    Mahasiswa(String nama, int umur, String jurusan) {
        this.nama = nama;
        this.umur = umur;
        this.jurusan = jurusan;
    }

    void belajar() {
        System.out.println(nama + " sedang belajar.");
    }

    void gantiProdi(String jurusanBaru) {
        this.jurusan = jurusanBaru;
    }

    void info() {
        System.out.println("Nama: " + nama);
        System.out.println("Umur: " + umur);
        System.out.println("Jurusan: " + jurusan);
    }
}