package Financial_Forecasting;

public class FinancialForecasting {
    public static double calculateFutureValue(double initialAmount, double growthRate, int years) {
        if (years == 0) {
            return initialAmount;
        }
        return calculateFutureValue(initialAmount, growthRate, years - 1) * (1 + growthRate);
    }
}
