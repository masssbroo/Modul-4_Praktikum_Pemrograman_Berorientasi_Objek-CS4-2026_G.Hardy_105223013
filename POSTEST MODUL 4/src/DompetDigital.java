class DompetDigital {
    String namaLengkap;
    String nomorTelepon;
    double saldo;

    // Constructor: Pendaftaran pelanggan baru
    public DompetDigital(String nama, String nomor) {
        this.namaLengkap = nama;
        this.nomorTelepon = nomor;
        this.saldo = 0; 
        System.out.println("\n[SISTEM]: Akun DuitKu berhasil dibuat untuk " + this.namaLengkap);
    }

    // Aktivitas 1: Pengisian Dana
    public void isiDana(double nominal) {
        if (nominal < 10000) {
            System.out.println("PERINGATAN KERAS: Nominal Rp " + String.format("%,.0f", nominal) + " DITOLAK! Minimum setoran Rp 10.000.");
        } else {
            this.saldo += nominal;
            System.out.println("--- STRUK RESI SETORAN ---");
            System.out.println("Setoran Berhasil : Rp " + String.format("%,.0f", nominal));
            System.out.println("Total Saldo      : Rp " + String.format("%,.0f", this.saldo));
            System.out.println("--------------------------");
        }
    }

    // Aktivitas 2: Pelunasan Tagihan
    public boolean bayarTagihan(double jumlah) {
        System.out.println("\nMemproses pembayaran tagihan sebesar Rp " + String.format("%,.0f", jumlah) + "...");
        if (this.saldo >= jumlah) {
            this.saldo -= jumlah;
            System.out.println("SINYAL KONFIRMASI: Pembayaran Berhasil!");
            return true;
        } else {
            System.out.println("SINYAL KEGAGALAN MUTLAK: Dana tidak mencukupi!");
            return false;
        }
    }

    public void tampilkanSisaSaldo() {
        System.out.printf("\nSISA SALDO AKURAT: Rp %,.0f\n", this.saldo);
    }
}