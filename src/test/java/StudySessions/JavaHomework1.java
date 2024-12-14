package StudySessions;

public class JavaHomework1 {
    public static void main(String[] args) {
     int inches = 2000;
     // One inch is 0.0254 meters..
        double meterConversionRate = 0.0254;

        // We should multipy inch value with meterConversionRate
        double meter = meterConversionRate * inches;

        System.out.println(inches + " inches is "+ meter + " meters");
    }
}
