public class Main {
    public static void main(String[] args) {
        System.out.println(">>> Uji Kamar 1 (Validasi Input)");
        KamarHotel kamar1 = new KamarHotel("101", "Presidential", 4, -10000); 

        System.out.println("\n>>> Uji Tagihan Kamar 1 (Voucher Gagal < 3 malam)");
        double bayar1 = kamar1.hitungTotalBayar(2, "PROMO");
        System.out.println("Total Bayar Kamar 1: Rp" + bayar1);

        System.out.println("\n>>> Uji Kamar 2 (Validasi Pemesanan)");
        KamarHotel kamar2 = new KamarHotel("202", "Suite", 2);
        kamar2.setHargaPerMalam(200000);

        kamar2.pesanKamar(4);

        kamar2.pesanKamar(2);

        kamar2.pesanKamar();

        System.out.println("\n>>> Uji Tagihan Kamar 2 (Voucher Berhasil)");
        double bayar2 = kamar2.hitungTotalBayar(4, "PROMO");
        System.out.println("Total Bayar Kamar 2: Rp" + bayar2);

        System.out.println("\n========= STRUK INFORMASI =========");
        kamar1.tampilkanProfilKamar();
        kamar2.tampilkanProfilKamar();
        System.out.println("===================================");
    }
}