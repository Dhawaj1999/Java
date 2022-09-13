package M__Recursion;

public class S__Remove_x {
    public static String removal(String s){
        if (s.length() <= 1){
            return s;
        }

        String small = removal(s.substring(1));
        if (s.charAt(0) == 'x'){
            return small;
        }

        return s.charAt(0) + small;
    }
    public static void main(String[] args) {
        System.out.println(removal("abdxbdxcc"));
    }
}
