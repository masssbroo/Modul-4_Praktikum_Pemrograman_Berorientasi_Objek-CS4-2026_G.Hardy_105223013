public class Main {
    public static void main(String[] args) {
        // --- Uji Kamar Pertama (Uji Ketahanan Setter) ---
        // Mencoba input "Presidential" dan harga "-10000" [cite: 22]
        System.out.println(">>> Uji Kamar 1 (Validasi Input)");
        KamarHotel kamar1 = new KamarHotel("101", "Presidential", 4, -10000); 
        // Hasil harus dipaksa ke "Reguler" dan "50000" [cite: 23]

        // Demonstrasi tagihan 2 malam dengan voucher "PROMO" (Harus Gagal) [cite: 26]
        System.out.println("\n>>> Uji Tagihan Kamar 1 (Voucher Gagal < 3 malam)");
        double bayar1 = kamar1.hitungTotalBayar(2, "PROMO");
        System.out.println("Total Bayar Kamar 1: Rp" + bayar1);

        // --- Uji Kamar Kedua (Uji Overcapacity & Pemesanan) ---
        System.out.println("\n>>> Uji Kamar 2 (Validasi Pemesanan)");
        // Dibuat dengan kapasitas 2 orang [cite: 23]
        KamarHotel kamar2 = new KamarHotel("202", "Suite", 2);
        kamar2.setHargaPerMalam(200000); // Set harga agar simulasi tagihan terasa

        // Coba pesan 4 orang (Harus diblokir karena overcapacity) [cite: 23, 24]
        kamar2.pesanKamar(4);

        // Pesan dengan jumlah tamu yang sesuai (2 orang) [cite: 24]
        kamar2.pesanKamar(2);

        // Coba pesan lagi tanpa parameter (Harus muncul peringatan terisi) [cite: 25]
        kamar2.pesanKamar();

        // Demonstrasi tagihan 4 malam dengan voucher "PROMO" (Harus Berhasil) [cite: 26]
        System.out.println("\n>>> Uji Tagihan Kamar 2 (Voucher Berhasil)");
        double bayar2 = kamar2.hitungTotalBayar(4, "PROMO");
        System.out.println("Total Bayar Kamar 2: Rp" + bayar2);

        // --- Akhir Simulasi: Struk Informasi [cite: 27] ---
        System.out.println("\n========= STRUK INFORMASI =========");
        kamar1.tampilkanProfilKamar();
        kamar2.tampilkanProfilKamar();
        System.out.println("===================================");
    }
}