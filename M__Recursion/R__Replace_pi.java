package M__Recursion;

public class R__Replace_pi {
    public static String pi(String s) {
        if (s.length() < 2) {
            return s;
        }
        String firstTwo = s.substring(0, 2);
        if (firstTwo.equals("pi")) {
            return "3.14" + pi(s.substring(2));
        } else {
            return s.charAt(0) + pi(s.substring(1));
        }
    }

    public static void main(String[] args) {
        System.out.println(pi("xpix"));
    }
}
