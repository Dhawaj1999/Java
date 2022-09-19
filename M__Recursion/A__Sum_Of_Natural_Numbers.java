package M__Recursion;

public class A__Sum_Of_Natural_Numbers {

    // I have written two functions here to show how this program can be done using two ways

    // first way
    public static int sum(int x, int n){
        if (x == n){
            return x;
        }
        int temp = sum(x+1, n);
        return temp + x;
    }

    // second way
    public static int sumTwo(int n){
        if (n == 1){
            return 1;
        }
        int temp = sumTwo(n-1);
        return temp + n;
    }

    public static void main(String[] args) {
        System.out.println(sum(1,5));
        System.out.println(sumTwo(5));
    }
}
