package Responsi2PBO.Pert7;

public interface PaymentMethod {

    String processPayment();

    String getPaymentDetails();

    double getTransactionFee();

    double getBalance();
}
