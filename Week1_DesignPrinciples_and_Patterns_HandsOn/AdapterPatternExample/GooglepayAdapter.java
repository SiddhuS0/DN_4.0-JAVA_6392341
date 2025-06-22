package AdapterPatternExample;

public class GooglepayAdapter implements PaymentProcessor {
    private GooglepayGateway googlePay;

    public GooglepayAdapter(GooglepayGateway googlePay) {
        this.googlePay = googlePay;
    }

    public void processPayment(double amount) {
        //adapts to googlepay method
        googlePay.sendMoneyViaGooglepay(amount);
    }
}
