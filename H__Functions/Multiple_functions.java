package H__Functions;

public class Multiple_functions {

    public static int sum(int a, int b){
    int c = a + b;
    if (c > a || c > b){
        System.out.println("c is greater");
    }
    return c;
}
    public static int printSum(int n){
        int m = n*n;
        int sum = sum(5,5);
        System.out.println(sum);
        return m;
    }

    public static void main(String[] args) {
        int total = printSum(3);
        System.out.println(total);
    }
}
