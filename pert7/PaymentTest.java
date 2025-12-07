
public class PaymentTest {

    public static void main(String[] args) {

        // TODO:
        // - Buat objek dari EWalletPayment
        // - Panggil method yang telah dibuat untuk menguji fungsionalitas
        // - Tampilkan hasil akhir informasi saldo dan detail pembayaran
        //
        // Contoh alur (boleh diikuti atau dimodifikasi oleh praktikan):
        // 1. Menampilkan data sebelum transaksi
        // 2. Memproses pembayaran
        // 3. Menampilkan data setelah transak
        System.out.println("=== PROGRAM SISTEM PEMBAYARAN (E-WALLET) ===");

        double saldoAwal = 150000;
        double tagihan = 50000;

        System.out.println("Saldo awal: Rp " + saldoAwal);

        EWalletPayment ovo = new EWalletPayment("OVO", saldoAwal, tagihan);

        ovo.processPayment();

        System.out.println(ovo.getPaymentDetails());
    }
}
