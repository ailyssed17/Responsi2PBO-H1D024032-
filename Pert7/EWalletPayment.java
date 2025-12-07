package Responsi2PBO.Pert7;

public class EWalletPayment implements PaymentMethod {

    private String layanan;
    private double saldo;
    private double nominal;
    private final double fee = 2000;

    public EWalletPayment(String layanan, double saldo, double nominal) {
        this.layanan = layanan;
        this.saldo = saldo;
        this.nominal = nominal;
    }

    @Override
    public String processPayment() {
        double total = nominal + fee;

        if (saldo >= total) {
            saldo -= total;
            return "Pembayaran berhasil!";
        } else {
            return "Pembayaran gagal! Saldo tidak cukup.";
        }
    }

    @Override
    public String getPaymentDetails() {
        return "Pembayaran dilakukan melalui " + layanan +
                " dengan nominal " + nominal +
                " dan biaya transaksi " + fee;
    }

    @Override
    public double getTransactionFee() {
        return fee;
    }

    @Override
    public double getBalance() {
        return saldo;
    }
}
