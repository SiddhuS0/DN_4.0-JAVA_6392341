//Main.java
public class Main {
    public static void main(String[] args) {
        //email
        Notifier emailNotifier = new EmailNotifier();
        //sms
        Notifier smsNotifier = new SMSNotifierDecorator(emailNotifier);
        //slack
        Notifier fullNotifier = new SlackNotifierDecorator(smsNotifier);
        //sending message through all 
        fullNotifier.send("\nSystem will go down for maintenance at midnight.");
    }
}
