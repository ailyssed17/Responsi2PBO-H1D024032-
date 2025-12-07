package Responsi2PBO.Pert7;

public class PaymentTest {

    public static void main(String[] args) {

        System.out.println("=== PROGRAM SISTEM PEMBAYARAN (E-WALLET) ===");

        EWalletPayment payment = new EWalletPayment("OVO", 150000, 50000);

        System.out.println("Saldo awal: " + payment.getBalance());
        System.out.println("Memproses pembayaran sebesar 50000...");

        String hasil = payment.processPayment();
        System.out.println(hasil);

        System.out.println("Sisa saldo: " + payment.getBalance());

        System.out.println("Detail Transaksi: " + payment.getPaymentDetails());
    }
}
