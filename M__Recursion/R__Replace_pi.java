package M__Recursion;

public class R__Replace_pi {
    public static void pi(String s, int i, String str) {
        if (i == s.length()){
            System.out.println(str);
            return;
        }
        if (i < s.length()-1 && s.charAt(i) == 'p' && s.charAt(i+1) == 'i'){
            pi(s, i+2, str+"3.14");
        }
        else {
            pi(s, i+1, str+s.charAt(i));
        }
    }

    public static void main(String[] args) {
        pi("xpixx", 0, "");
    }
}
