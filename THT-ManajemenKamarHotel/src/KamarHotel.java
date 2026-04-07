public class KamarHotel {
    private String nomorKamar;
    private String tipeKamar;
    private int kapasitasMaksimal;
    private double hargaPerMalam;
    private boolean isTersedia;

    public KamarHotel(String nomorKamar, String tipeKamar, int kapasitasMaksimal) {
        this.nomorKamar = nomorKamar;
        setTipeKamar(tipeKamar);
        this.kapasitasMaksimal = kapasitasMaksimal;
        this.hargaPerMalam = 0;
        this.isTersedia = true;
    }

    public KamarHotel(String nomor, String tipe, int kapasitas, double harga) {
        this.nomorKamar = nomor;
        setTipeKamar(tipe);
        this.kapasitasMaksimal = kapasitas;
        setHargaPerMalam(harga);
        this.isTersedia = true;
    }

    public String getNomorKamar() { return nomorKamar; }
    public String getTipeKamar() { return tipeKamar; }
    public int getKapasitasMaksimal() { return kapasitasMaksimal; }
    public double getHargaPerMalam() { return hargaPerMalam; }
    public boolean isTersedia() { return isTersedia; }

    public void setTipeKamar(String tipe) {
        if (tipe.equalsIgnoreCase("Reguler") || tipe.equalsIgnoreCase("Premium") || tipe.equalsIgnoreCase("Suite")) {
            this.tipeKamar = tipe;
        } else {
            System.out.println("Peringatan: Tipe ditolak, otomatis diatur ke Reguler.");
            this.tipeKamar = "Reguler";
        }
    }

    public void setHargaPerMalam(double harga) {
        if (harga < 50000) {
            System.out.println("Peringatan: Harga di bawah 50000 ditolak, dipaksa ke 50000.");
            this.hargaPerMalam = 50000;
        } else {
            this.hargaPerMalam = harga;
        }
    }

    public void pesanKamar() {
        if (isTersedia) {
            isTersedia = false;
            System.out.println("Kamar " + nomorKamar + " berhasil dipesan.");
        } else {
            System.out.println("Peringatan: Kamar sudah terisi.");
        }
    }

    public void pesanKamar(int jumlahTamu) {
        if (jumlahTamu > kapasitasMaksimal) {
            System.out.println("Pesanan Ditolak: Overcapacity! Status tetap tersedia.");
        } else if (!isTersedia) {
            System.out.println("Peringatan: Kamar sudah terisi.");
        } else {
            isTersedia = false;
            System.out.println("Kamar " + nomorKamar + " berhasil dipesan untuk " + jumlahTamu + " orang.");
        }
    }

    public void batalPesan() {
        this.isTersedia = true;
        System.out.println("Pesanan dibatalkan, kamar kembali tersedia.");
    }

    public double hitungTotalBayar(int jumlahMalam) {
        return hargaPerMalam * jumlahMalam;
    }

    public double hitungTotalBayar(int jumlahMalam, String kodeVoucher) {
        double total = hitungTotalBayar(jumlahMalam);
        if (kodeVoucher.equals("PROMO") && jumlahMalam >= 3) {
            return total * 0.8;
        } else {
            System.out.println("Voucher ditolak: Syarat minimum malam tidak terpenuhi atau kode salah.");
            return total;
        }
    }

    public void tampilkanProfilKamar() {
        System.out.println("---------------------------------");
        System.out.println("Nomor Kamar : " + nomorKamar);
        System.out.println("Tipe Kamar  : " + tipeKamar);
        System.out.println("Kapasitas   : " + kapasitasMaksimal + " orang");
        System.out.println("Harga/Malam : Rp" + hargaPerMalam);
        System.out.println("Tersedia    : " + (isTersedia ? "Ya" : "Tidak"));
    }
}