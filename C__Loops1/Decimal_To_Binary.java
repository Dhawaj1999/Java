package C__Loops1;

public class Decimal_To_Binary {
    public static void main(String[] args) {
        int n = 8;
        String s = "";
        while (n > 0){
            int r = n % 2;
            n = n / 2;
            s = r + s;
        }
        System.out.println(s);
    }
}
