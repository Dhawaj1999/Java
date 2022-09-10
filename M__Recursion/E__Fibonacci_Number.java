package M__Recursion;

public class E__Fibonacci_Number {
    public static int fibonacciNumber(int n){
        if (n == 0 || n == 1){
            return n;
        }

        int temp = fibonacciNumber(n-1) + fibonacciNumber(n-2);
        return temp;
    }
    public static void main(String[] args) {
        int res = fibonacciNumber(5);
        System.out.println(res);
    }
}
