package M__Recursion;

public class A__Sum_Of_Natural_Numbers {
    public static int sum(int n){
        if (n == 0){
            return 0;
        }
        int temp = sum(n-1);
        int sum = temp+n;
        return sum;
    }
    public static void main(String[] args) {
        int result = sum(5);
        System.out.println(result);
    }
}
