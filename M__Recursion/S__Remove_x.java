package M__Recursion;

public class S__Remove_x {
    public static void removal(String s, int i, String str){
        if (i == s.length()){
            System.out.println(str);
            return;
        }
        if (s.charAt(i) == 'x'){
            removal(s, i+1, str);
        }
        else {
            removal(s, i+1, str+s.charAt(i));
        }
    }
    public static void main(String[] args) {

        removal("abdxbdxcc", 0, "");
    }
}
