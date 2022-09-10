package M__Recursion;

public class P__Palindrome {
    public static boolean palindrome(String s, int i, int j){
        if (s.charAt(i) == s.charAt(j)){
            return true;
        }

        if (s.charAt(i) != s.charAt(j)){
            return false;
        }

        return palindrome(s, i+1, j-1);
    }

    public static boolean input(String s){
        return palindrome(s, 0, s.length()-1);
    }

    public static void main(String[] args) {
        String s = "racecar";
        boolean str = input(s);
        System.out.println(str);
    }
}
