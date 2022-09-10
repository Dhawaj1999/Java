package M__Recursion;

public class M__Multiplication_Recursion {
    public static int multiply(int a, int b){
        if (b == 1){
            return a;
        }

        int temp = multiply(a, b-1);
        return temp + a;
    }
    public static void main(String[] args) {
        int res = multiply(2,8);
        System.out.print(res);
    }
}
