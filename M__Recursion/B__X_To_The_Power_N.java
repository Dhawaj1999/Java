package M__Recursion;

public class B__X_To_The_Power_N {
    public static int power(int x, int n){
        if (n == 0)
            return 1;
        int temp = power(x, n-1);
        int result = x * temp;
        return result;
    }
    public static void main(String[] args) {
        int result = power(3, 4);
        System.out.println(result);
    }
}
