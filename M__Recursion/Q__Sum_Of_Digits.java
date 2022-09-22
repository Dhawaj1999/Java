package M__Recursion;

public class Q__Sum_Of_Digits {
    public static int sumOfDigits(int n){
        if (n == 0){
            return n;
        }

        int temp = sumOfDigits(n/10);
        return temp + (n%10);
    }
    public static void main(String[] args) {
        int n = 1234;
        System.out.println(sumOfDigits(n));
    }
}
