package M__Recursion;

public class T__String_To_Integer {
    public static int stringToInteger(String s){
        if (s.length() <= 1){
            return s.charAt(0) - '0';
        }

        int small = stringToInteger(s.substring(0,s.length()-1));

        int lastDigit = s.charAt(s.length()-1) - '0';
        return small*10 + lastDigit;
    }
    public static void main(String[] args) {
        System.out.println(stringToInteger("1234"));
    }
}
