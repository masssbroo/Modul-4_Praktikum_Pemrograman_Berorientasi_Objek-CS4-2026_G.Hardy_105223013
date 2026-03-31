import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("=== PENDAFTARAN PELANGGAN DUITKU ===");
        System.out.print("Masukkan Nama Lengkap: ");
        String nama = input.nextLine();
        System.out.print("Masukkan Nomor Telepon: ");
        String nomor = input.nextLine();
        
        DompetDigital user = new DompetDigital(nama, nomor);

        
        System.out.print("\nMasukkan nominal setoran pertama: ");
        String strSetor1 = input.next();
        double setor1 = Double.parseDouble(strSetor1.replace(".", ""));
        user.isiDana(setor1);

        System.out.print("\nMasukkan nominal tagihan listrik: ");
        String strTagihan = input.next();
        double tagihan = Double.parseDouble(strTagihan.replace(".", ""));
        user.bayarTagihan(tagihan);

        System.out.print("\nMasukkan nominal setoran tambahan: ");
        String strSetor2 = input.next();
        double setor2 = Double.parseDouble(strSetor2.replace(".", ""));
        user.isiDana(setor2);

        System.out.println("\n[SISTEM]: Mencoba memproses ulang tagihan sebelumnya...");
        user.bayarTagihan(tagihan);

        user.tampilkanSisaSaldo();

        input.close();
    }
}