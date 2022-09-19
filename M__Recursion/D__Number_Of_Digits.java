package M__Recursion;

public class D__Number_Of_Digits {
    public static int digit(int n){
        if (n == 0)
            return n;

        int count = digit(n/10);
        return count + 1;
    }
    public static void main(String[] args) {
        int print = digit(10);
        System.out.println(print);
    }
}
