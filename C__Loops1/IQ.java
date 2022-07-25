package C__Loops1;

public class IQ {
    public static void main(String[] args) {

        for (double x = 5.5; x <= 12.5; x = x + 0.5){
            for (double y = 1; y <= 6; ++y){
                double iq = 2 + (y + 0.5 * x);
                System.out.println("x = " + x + " y = " + y + " iq " + iq);
            }
        }
    }
}
