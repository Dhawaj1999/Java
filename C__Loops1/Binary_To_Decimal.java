package C__Loops1;

public class Binary_To_Decimal {
    public static void main(String[] args) {
        int n = 1011;
        int i = 0, decimal = 0;

        while (n > 0){
            int r = n % 10;
            n = n / 10;
            decimal = decimal + r * (int) (Math.pow(2, i++));
        }
        System.out.println(decimal);
    }
}
