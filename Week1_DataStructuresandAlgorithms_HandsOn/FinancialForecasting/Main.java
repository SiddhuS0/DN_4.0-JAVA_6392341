package FinancialForecasting;

public class Main {
    public static void main(String[] args) {
        double initialValue = 10000.0;   //init investment
        double growthRate = 0.10;        //assuming 10% as growthrate
        int years = 5;                   //for 5y

        double futureValue = FinancialForecast.predictFutureValue(initialValue, growthRate, years);
        System.out.printf("Predicted Future Value : %.2f\n", futureValue);
    }
}
