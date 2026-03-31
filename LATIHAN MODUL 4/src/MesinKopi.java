class MesinKopi {
    // Soal 1: Atribut bahan baku
    int bijiKopi;
    int air;
    int susu;

    // Soal 4: Constructor 
    public MesinKopi() {
        this.bijiKopi = 0;
        this.air = 0;
        this.susu = 0;
    } 

    // Soal 2: Method void untuk mengisi ulang bahan
    public void isiUlangBahan(int kopi, int air, int susu) {
        this.bijiKopi += kopi;
        this.air += air;
        this.susu += susu;
        System.out.println("Bahan baku berhasil diisi ulang.");
    }

    // Soal 3: Method boolean untuk cek ketersediaan
    public boolean cekKetersediaanCappuccino() {
        if (this.bijiKopi >= 15 && this.air >= 50 && this.susu >= 100) {
            return true;
        } else {
            return false;
        }
    } 
}