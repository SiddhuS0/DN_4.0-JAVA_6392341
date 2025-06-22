package AdapterPatternExample;

public class PhonepeAdapter implements PaymentProcessor {
    private PhonepeGateway phonePe;

    public PhonepeAdapter(PhonepeGateway phonePe) {
        this.phonePe = phonePe;
    }

    public void processPayment(double amount) {
        //adapts to phonepe method
        phonePe.SendMoneyViaPhonepe(amount);
    }
}
