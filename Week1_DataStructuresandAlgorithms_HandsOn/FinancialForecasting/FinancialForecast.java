package FinancialForecasting;

public class FinancialForecast {

    //recursion method to calculate future values
    public static double predictFutureValue(double currValue, double growthRate, int years) {
        if (years==0) {
            return currValue;
        }
        return (1+growthRate)*predictFutureValue(currValue,growthRate,years-1);
    }
}
