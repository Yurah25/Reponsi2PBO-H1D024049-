
public interface PaymentMethod {

    // TODO: Tambahkan method abstract berikut:
    public abstract void processPayment();
    public abstract String getPaymentDetails();
    public abstract double getTransactionFee();
    public abstract double getBalance();
    // - processPayment(): digunakan untuk memproses pembayaran
    // - getPaymentDetails(): mengembalikan informasi pembayaran
    // - getTransactionFee(): mengembalikan biaya transaksi
    // - getBalance(): mengembalikan saldo	
}
