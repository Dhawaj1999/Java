package M__Recursion;

public class Q__Sum_Of_Digits {
    public static int sumOfDigits(int n){
        if (n == 0){
            return 0;
        }

        int temp = sumOfDigits(n/10);
        int sum = temp + (n%10);
        return sum;

    }
    public static void main(String[] args) {
        int n = 1234;
        int r = sumOfDigits(n);
        System.out.println(r);
    }
}
