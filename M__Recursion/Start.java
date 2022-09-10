package M__Recursion;

public class Start {
    public static int fact(int n){
        if (n == 0){
            return 1;
        }
        int temp = fact(n-1);
        int res = temp * n;
        return res;
    }
    public static void main(String[] args) {
       int result =  fact(5);
        System.out.println(result);
    }
}
