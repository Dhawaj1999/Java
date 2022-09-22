package M__Recursion;

public class S__Remove_x {
    public static String removal(String s){
        if (s.length() < 1){
            return s;
        }
        String check = s.substring(0,1);
        if (check.equals("x")){
            return removal(s.substring(1));
        } else {
            return s.charAt(0) + removal(s.substring(1));
        }
    }
    public static void main(String[] args) {
        System.out.println(removal("abdxbdxcc"));
    }
}
