public class Main {
    public static void main(String[] args) {
        // Soal 1: Menciptakan satu objek nyata dengan nama mesinLobby
        MesinKopi mesinLobby = new MesinKopi();

        // Simulasi Penggunaan Mesin Kopi

        // 1. Cek kondisi awal 
        System.out.println("Apakah mesinLobby siap buat Cappuccino? " + mesinLobby.cekKetersediaanCappuccino());

        // 2. Mengisi ulang bahan
        mesinLobby.isiUlangBahan(50, 200, 300);

        // 3. Cek kembali ketersediaan 
        System.out.println("Apakah sekarang mesinLobby siap? " + mesinLobby.cekKetersediaanCappuccino());
        
        // 4. Verifikasi nilai atribut (Opsional, untuk memastikan Soal 1 & 2 berhasil)
        System.out.println("\nStok di mesinLobby saat ini:");
        System.out.println("Kopi: " + mesinLobby.bijiKopi + " gram");
        System.out.println("Air : " + mesinLobby.air + " ml");
        System.out.println("Susu: " + mesinLobby.susu + " ml");
    }
}