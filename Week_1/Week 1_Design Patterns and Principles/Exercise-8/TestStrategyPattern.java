package StrategyPatternExample;

public class TestStrategyPattern {
    public static void main(String[] args) {
        PaymentContext context = new PaymentContext();

        // Pay with Credit Card
        PaymentStrategy creditCardPayment = new CreditCardPayment("1234 5678 9012 3456", "John Doe", "123", "12/25");
        context.setPaymentStrategy(creditCardPayment);
        context.executePayment(150.0);

        // Pay with PayPal
        PaymentStrategy payPalPayment = new PayPalPayment("john.doe@example.com");
        context.setPaymentStrategy(payPalPayment);
        context.executePayment(200.0);
    }
}