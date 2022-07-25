package C__Loops1;

public class Armstrong_Number {
    public static void main(String[] args) {

        int s = 1;
        int l = 500;

        for (s = 1; s <= 9; ++s) {
            if (s < 10) {
                int d1 = s % 10;
                int p = d1 * d1 * d1;
                if (p == s) {
                    System.out.println(s);
                }
            }
        }
        for (s = 10; s >= 10 && s < 100; ++s) {
            if (s >= 10 && s < 100) {
                int d1 = s / 10 % 10;
                int d2 = s % 10;
                int p1 = d1 * d1 * d1;
                int p2 = d2 * d2 * d2;
                int result = p1 + p2;
                if (result == s) {
                    System.out.println(s);
                }
            }
        }
        for (s = 100; s >= 100 && s < l; ++s) {
            if (s >= 100 && s < l) {
                int d1 = s / 100 % 10;
                int d2 = s / 10 % 10;
                int d3 = s % 10;
                int p1 = d1 * d1 * d1;
                int p2 = d2 * d2 * d2;
                int p3 = d3 * d3 * d3;
                int result = p1 + p2 + p3;
                if (result == s) {
                    System.out.println(s);
                }
            }
        }
    }
}
