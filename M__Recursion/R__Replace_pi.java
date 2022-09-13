package M__Recursion;

public class R__Replace_pi {
    public static String pi(String s){
        String output;

        if (s.length() <= 1){
            return s;
        }

        String small = pi(s.substring(1));

        if (s.charAt(0) == 'p' && small.charAt(0) == 'i'){
            output = 3.14 + small.substring(1);
        }
        else {
            output = s.charAt(0) + small;
        }
        return output;
    }
    public static void main(String[] args) {
        System.out.println(pi("xpix"));
    }
}
