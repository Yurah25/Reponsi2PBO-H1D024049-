
public class EWalletPayment implements PaymentMethod {

    // TODO: Buat atribut yang diperlukan, misalnya:
    // - nama penyedia layanan (contoh: Dana, OVO, Gopay)
    // - jumlah saldo
    // - nominal transaksi
    private String namaLayanan;
    private double jumlahSaldo;
    private double nominalTransaksi;
    // TODO: Buat constructor untuk mengisi nilai atribut
    public EWalletPayment(String namaLayanan, double jumlahSaldo, double nominalTransaksi) {
        this.namaLayanan = namaLayanan;
        this.jumlahSaldo = jumlahSaldo;
        this.nominalTransaksi = nominalTransaksi;
    }
    // TODO: Implementasikan semua method yang ada pada interface PaymentMethod
    @Override
    public double getTransactionFee() {
        return 2000.0;
    }
    @Override
    public double getBalance() {
        return this.jumlahSaldo;
    }

    @Override
    public void processPayment() {
        double totalBiaya = nominalTransaksi + getTransactionFee();

        System.out.println("Memproses pembayaran sebesar Rp " + nominalTransaksi+ "...");
        System.out.println("Biaya admin: Rp " + getTransactionFee());

        if (jumlahSaldo >= totalBiaya) {
            jumlahSaldo = jumlahSaldo- totalBiaya;
            System.out.println("Pembayaran berhasil!");
        } else {
            System.out.println("Pembayaran gagal! Saldo tidak cukup (Kurang: Rp " + (totalBiaya - jumlahSaldo) + ")");
        }
    }

    @Override
    public String getPaymentDetails() {
        return "Detail Transaksi: Pembayaran dilakukan melalui " + namaLayanan + " | Sisa Saldo: Rp " +jumlahSaldo;
    }
    // Catatan:
    // - Pada method processPayment(), lakukan pengecekan kecukupan saldo
    // - Jika saldo cukup, kurangi saldo lalu tampilkan pesan berhasil
    // - Jika saldo tidak cukup, tampilkan pesan gagal

}
