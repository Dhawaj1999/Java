package A__GettingStarted;

public class CovertTemperature {
    public static void main(String[] args) {
        // convert fahrenheit to celcius
        double temp = 86;
        double cel = (temp - 32) * (5.0/9.0);
        System.out.println(cel);
    }
}
