package M__Recursion;

public class D__Number_Of_Digits {
    public static int digit(int n){
        if (n == 0)
            return 0;

        int temp = digit(n/10);
        int res = temp+1;
        return res;
    }
    public static void main(String[] args) {
        int print = digit(10);
        System.out.println(print);
    }
}
