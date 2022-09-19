package M__Recursion;

public class B__X_To_The_Power_N {
    public static int power(int x, int n) {
        if (n == 1) {
            return x;
        }
        int temp = power(x, n-1);
        return x * temp;
    }
    public static void main(String[] args) {
        int result = power(3, 4);
        System.out.println(result);
    }
}
