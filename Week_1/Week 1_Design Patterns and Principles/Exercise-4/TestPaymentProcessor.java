package AdapterPatternExample;

public class TestPaymentProcessor {
    public static void main(String[] args) {
        PaymentProcessor paypalProcessor = new PayPalAdapter(new PayPal());
        paypalProcessor.processPayment(100.0);

        PaymentProcessor stripeProcessor = new StripeAdapter(new Stripe());
        stripeProcessor.processPayment(200.0);

        PaymentProcessor squareProcessor = new SquareAdapter(new Square());
        squareProcessor.processPayment(300.0);
    }
}
