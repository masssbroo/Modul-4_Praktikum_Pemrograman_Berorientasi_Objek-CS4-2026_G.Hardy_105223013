public class App {
    public static void main(String[] args) throws Exception {
        Mahasiswa mhsBaru = new Mahasiswa("Andi", 20, "Informatika");

        mhsBaru.belajar();
        mhsBaru.info();
        mhsBaru.gantiProdi("Sistem Informasi");
        mhsBaru.info();
    }
}