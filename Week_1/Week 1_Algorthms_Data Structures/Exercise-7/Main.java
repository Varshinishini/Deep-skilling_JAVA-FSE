package Financial_Forecasting;

public class Main {
    public static void main(String[] args) {
        double initialAmount = 1000.0;
        double growthRate = 0.05; // 5%
        int years = 10;

        double futureValue = FinancialForecasting.calculateFutureValue(initialAmount, growthRate, years);
        System.out.println("Future Value: " + futureValue);
    }
}
