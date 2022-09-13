package M__Recursion;

public class U__Pair_Star {
    public static String pairStar(String s){
        if (s.length() <= 1){
            return s;
        }

        String small = pairStar(s.substring(1));
        if (s.charAt(0) == small.charAt(0)){
            return s.charAt(0) + "*" + small;
        }
        return s.charAt(0) + small;
    }
    public static void main(String[] args){
        System.out.println(pairStar("sell"));
    }
}
