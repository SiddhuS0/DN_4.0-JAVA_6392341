//SMSNotifierDecorator.java
public class SMSNotifierDecorator extends NotifierDecorator {
    public SMSNotifierDecorator(Notifier notifier) {
        super(notifier);
    }
    @Override
    public void send(String message) {
        super.send(message); //first sending existing notifier message
        sendSMS(message);    //then add sms functionality
    }
    private void sendSMS(String message) {
        System.out.println("Sending SMS Message: " + message);
    }
}
