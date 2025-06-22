package AdapterPatternExample;

public class Main {
    public static void main(String[] args) {
        //phonepe payment
        PaymentProcessor phonePeProcessor = new PhonepeAdapter(new PhonepeGateway());
        phonePeProcessor.processPayment(7777.00);

        //googlepay paymen
        PaymentProcessor googlePayProcessor = new GooglepayAdapter(new GooglepayGateway());
        googlePayProcessor.processPayment(1234.00);
    }
}
