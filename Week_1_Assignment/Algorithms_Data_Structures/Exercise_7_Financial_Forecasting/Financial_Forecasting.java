

public class Financial_Forecasting {
    public static double calculate(double curr, double growth, double year ){
        if(year == 0){
            return curr;
        } else{ 
            return calculate(curr , growth, year - 1)* (1 + growth);
        }
    }

    public static void main(String[] args) {
        double currentValue = 1000; 
        double growthRate = 0.05; 
        double years = 10; 

        double futureValue = calculate(currentValue, growthRate, years);
        System.out.printf("The value of the investment after %.0f years is: %.2f%n", years, futureValue);
    }

}
