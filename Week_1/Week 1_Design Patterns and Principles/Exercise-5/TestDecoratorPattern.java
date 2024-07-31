package DecoratorPatternExample;

public class TestDecoratorPattern {
    public static void main(String[] args) {
        Notifier emailNotifier = new EmailNotifier();

        // Add SMS functionality to EmailNotifier
        Notifier smsNotifier = new SMSNotifierDecorator(emailNotifier);

        // Add Slack functionality on top of SMSNotifier
        Notifier slackNotifier = new SlackNotifierDecorator(smsNotifier);

        // Send notification through multiple channels
        slackNotifier.send("Hello, this is a test notification.");
    }
}
